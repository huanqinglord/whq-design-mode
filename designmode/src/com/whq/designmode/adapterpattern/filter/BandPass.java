package com.whq.designmode.adapterpattern.filter;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/11 8:52
 * @desc:
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
     public BandPass(double lowCutoff, double highCutoff){
         this.lowCutoff = lowCutoff;
         this.highCutoff = highCutoff;
     }

    @Override
    public String name() {
        return super.name() + " Override Fiter name methor!(BandPass class)";
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
