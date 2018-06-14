package com.whq.designmode.factorypattern.servicefactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:02
 * @desc:
 */
public class ServiceImpl1 implements Service {
    @Override
    public void method() {
        print("ServiceImpl1.method!");
    }
}
