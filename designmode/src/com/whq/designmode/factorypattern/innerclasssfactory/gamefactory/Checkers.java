package com.whq.designmode.factorypattern.innerclasssfactory.gamefactory;

import com.whq.designmode.factorypattern.gamefactory.Game;
import com.whq.designmode.factorypattern.gamefactory.GameFactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 10:34
 * @desc:
 */
public class Checkers implements Game {
    private int moves = 0;

    private static final int MOVES = 3;
    @Override
    public boolean move() {
        print("Checkers class (inner class factory method) move = " + moves);
        return ++moves != MOVES;
    }
    //内部类代替工厂类，可以减少类的数量
    public static GameFactory factory =
            new GameFactory() {
                @Override
                public Game createGame() {
                    return new Checkers();
                }
            };
}
