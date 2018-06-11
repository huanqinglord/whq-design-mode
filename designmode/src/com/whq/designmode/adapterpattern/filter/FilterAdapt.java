package com.whq.designmode.adapterpattern.filter;

import com.whq.designmode.adapterpattern.Processor;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:56
 * @desc:
 */
public class FilterAdapt implements Processor {
    private Filter filter;

    public FilterAdapt(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
