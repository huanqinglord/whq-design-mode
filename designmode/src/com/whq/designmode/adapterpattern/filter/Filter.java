package com.whq.designmode.adapterpattern.filter;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:46
 * @desc:
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){return input;}
}
