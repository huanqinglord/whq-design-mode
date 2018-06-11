package com.whq.designmode.strategypattern;

import static com.whq.util.Print.*;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 16:08
 * @desc: 创建一个能够根据所传参数对象的不同而具有不同行为的方法，被称为策略设计模式。
 * 这类方法包含所要执行的算法中固定不变的部分，而“策略”包含变化的部分。
 * 策略就是传递进去的参数对象，他包含要执行的代码，这里策略就是“Processor”对象
 */
public class Apply {
    public static void process(Processor processor, Object s) {
        print("Using Processor" + processor.name());
        print(processor.process(s));
    }
    public static String s = "策略模式测试：Strategy pattern!";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
