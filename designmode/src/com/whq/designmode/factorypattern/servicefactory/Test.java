package com.whq.designmode.factorypattern.servicefactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:08
 * @desc:
 */
public class Test {
    public static void test(ServiceFactory serviceFactory){
        serviceFactory.createService().method();
    }
    public static void test1(Service service){service.method();}
    public static void main(String[] args) {
        test(new ServiceImpl1Factory());
        test(new ServiceImpl2Factory());

        //以上模式可以如下实现
        test1(new ServiceImpl1());
        test1(new ServiceImpl2());
        //同样的效果为何把Service接口的实现类不用new的方式呢，为何中间要加一层工厂模式？
    }
}
