package com.whq.designmode.factorypattern.gamefactory;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:44
 * @desc:
 */
public class Test {
    public static void playGame(GameFactory gameFactory){
        Game game = gameFactory.createGame();
        while (game.move());
    }

    public static void playGame1(Game game){
        while (game.move());
    }
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());

        playGame1(new Checkers());
        playGame1(new Chess());
        //工厂模式的好处：
        //以Game例子说明。如果使用playGame1方法实现。如果后期Game的实现类的构造对象方式发生改变，
        //如果我调用playGame1(new Chess());调用了3遍，我就需要修改三处地方。
        //但是如果使用palyGame方法，Chess的对象是工厂方法中构造的，我只需修改工厂方法中的Chess对象生成策略即可。

        //工厂方式适用于框架的编写。框架对外暴漏的对象生成方式以工厂模式实现。实际应用中别人使用你的框架中的工厂模式生成对象。
        //这样如果后期框架中关于此对象有修改的话 无需开发人员将使用此对象的每处进行修改，只需要你改工厂方法即可。
    }
}
