package com.whq.designmode.adapterpattern.filter;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:47
 * @desc:
 */
public class Waveform {
    public static long counter;
    private final long id = counter++;
    @Override
    public String toString(){return "Waveform" + id;}
}
