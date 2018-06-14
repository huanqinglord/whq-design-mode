package com.whq.designmode.factorypattern.gamefactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:38
 * @desc:
 */
public class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;
    @Override
    public boolean move() {
        print("Checkers move:" + moves);
        return ++moves != MOVES;
    }
}
