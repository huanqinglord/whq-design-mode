package com.whq.designmode.adapterpattern.filter;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/11 8:47
 * @desc:
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
