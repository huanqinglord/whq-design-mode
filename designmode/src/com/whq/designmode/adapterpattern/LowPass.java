package com.whq.designmode.adapterpattern;

import com.whq.designmode.adapterpattern.filter.Filter;
import com.whq.designmode.adapterpattern.filter.Waveform;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:50
 * @desc:
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {return input;}
}
