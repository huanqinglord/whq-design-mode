package com.whq.designmode.factorypattern.innerclasssfactory.servicefactory;

import com.whq.designmode.factorypattern.servicefactory.ServiceFactory;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 10:29
 * @desc: 类Implementation1与Implementation2工厂方法在其内部定义，省去了编写工厂类
 */
public class Test {
    public static void service(ServiceFactory serviceFactory){
        serviceFactory.createService().method();
    }

    public static void main(String[] args) {
        service(Implementation1.factory);
        service(Implementation2.factory);
    }
}
