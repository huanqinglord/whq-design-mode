package com.whq.designmode.adapterpattern;

import java.util.Arrays;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:44
 * @desc:
 */
public class Splitter extends StringProcessor {
    @Override
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
