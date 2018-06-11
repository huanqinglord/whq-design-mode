package com.whq.designmode.singletonpattern;

import com.whq.designmode.strategypattern.Apply;

import static com.whq.util.Print.print;


/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:09
 * @desc:
 */
public class TestSingleton {
    public static void main(String[] args) {
        Apply a1 = new Apply();
        Apply a2 = new Apply();
        print(a1);
        print(a2);

        print(ToolsService.getInstances());
        print(ToolsService.getInstances());
    }
}
