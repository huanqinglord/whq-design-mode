package com.whq.designmode.factorypattern.innerclasssfactory.gamefactory;

import com.whq.designmode.factorypattern.gamefactory.Game;
import com.whq.designmode.factorypattern.gamefactory.GameFactory;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 10:42
 * @desc:
 */
public class Test {
    public static void play(GameFactory factory){
        Game game = factory.createGame();
        while(game.move());
    }

    public static void main(String[] args) {
        play(Checkers.factory);
        play(Chess.factory);
    }
}
