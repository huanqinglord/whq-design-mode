package com.whq.designmode.factorypattern.servicefactory;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 10:08
 * @desc:
 */
public class ServiceImpl2Factory implements ServiceFactory {
    @Override
    public Service createService() {
        return new ServiceImpl2();
    }
}
