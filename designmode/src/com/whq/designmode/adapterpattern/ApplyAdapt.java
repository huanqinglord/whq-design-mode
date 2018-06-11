package com.whq.designmode.adapterpattern;

import com.whq.designmode.strategypattern.*;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:35
 * @desc:
 */
public class ApplyAdapt {
    public static void process(Processor processor, Object s) {
        print("Using Processor" + processor.name());
        print(processor.process(s));
    }
}
