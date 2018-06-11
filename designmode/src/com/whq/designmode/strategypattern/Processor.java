package com.whq.designmode.strategypattern;

import java.util.Arrays;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 16:00
 * @desc:
 */
public class Processor {
    public String name(){
        //return class name
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }

}

class Upcase extends Processor{
    @Override
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    @Override
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    @Override
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}


