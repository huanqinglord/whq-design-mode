package com.whq.designmode.adapterpattern;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:43
 * @desc:
 */
public class Upcase extends StringProcessor{
    @Override
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
