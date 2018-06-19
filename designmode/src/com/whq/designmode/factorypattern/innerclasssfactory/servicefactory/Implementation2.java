package com.whq.designmode.factorypattern.innerclasssfactory.servicefactory;

import com.whq.designmode.factorypattern.servicefactory.Service;
import com.whq.designmode.factorypattern.servicefactory.ServiceFactory;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 10:26
 * @desc:
 */
public class Implementation2 implements Service {
    @Override
    public void method() {
        print(getClass().getSimpleName());
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service createService() {
                    return new Implementation2();
                }
            };
}
