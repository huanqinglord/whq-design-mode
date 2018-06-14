package com.whq.designmode.factorypattern.gamefactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:41
 * @desc:
 */
public class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        print("Chess moves:" + moves);
        return ++moves != MOVES;
    }
}
