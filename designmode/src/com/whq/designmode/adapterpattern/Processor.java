package com.whq.designmode.adapterpattern;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:22
 * @desc:
 */
public interface Processor {
    String name();
    Object process(Object input);
}
