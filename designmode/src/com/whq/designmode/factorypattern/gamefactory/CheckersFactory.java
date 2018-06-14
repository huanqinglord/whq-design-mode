package com.whq.designmode.factorypattern.gamefactory;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:43
 * @desc:
 */
public class CheckersFactory implements GameFactory {
    @Override
    public Game createGame() {
        return new Checkers();
    }
}
