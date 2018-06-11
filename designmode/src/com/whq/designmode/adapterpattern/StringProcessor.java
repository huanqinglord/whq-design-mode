package com.whq.designmode.adapterpattern;

import java.util.Arrays;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:24
 * @desc:
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object input);

    public static String s = "it is test!";

    public static void main(String[] args) {
        ApplyAdapt.process(new Upcase(), s);
        ApplyAdapt.process(new Downcase(), s);
        ApplyAdapt.process(new Splitter(), s);
    }

}
