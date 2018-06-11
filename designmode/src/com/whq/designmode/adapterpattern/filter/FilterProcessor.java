package com.whq.designmode.adapterpattern.filter;

import com.whq.designmode.adapterpattern.ApplyAdapt;
import com.whq.designmode.adapterpattern.Splitter;
import com.whq.designmode.adapterpattern.Upcase;
import com.whq.designmode.strategypattern.Apply;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:59
 * @desc:
 */
public class FilterProcessor {
    public static String s = "it is test!!";
    public static void main(String[] args) {
        //以下传入参数为接口Processor的实现类
        ApplyAdapt.process(new Upcase(), s);
        ApplyAdapt.process(new Splitter(), s);

        //Filter类没有实现Processor接口，如何调用ApplyAdapt类中的方法process呢？
        //通过适配器模式
        //关键类 FilterAdapt实现Processor接口
        //按照如下方式即可实现Filter参数的调用
        Waveform waveform = new Waveform();
        ApplyAdapt.process(new FilterAdapt(new Filter()), waveform);
        //Filter继承类调用
        ApplyAdapt.process(new FilterAdapt(new LowPass(10.0)), waveform);//向上转型父类Filter中的name方法打印出的类名为LowPass
        ApplyAdapt.process(new FilterAdapt(new BandPass(1.0, 2)), waveform);
    }
}
