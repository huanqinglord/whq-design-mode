package com.whq.designmode.iteratorpattern.selector;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 15:32
 * @desc: 定义迭代器角色
 */
public interface Selector {
    boolean hasNext();
    Object next();
}
