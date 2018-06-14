package com.whq.designmode.adapterpattern.randomwords;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 8:57
 * @desc: 相对于继承RandomDoubles类（使用继承来完成适配），此处使用组合方式
 */
public class ReadableAdapt1 implements Readable{
    private RandomDoubles randomDoubles;
    private int count = 10;

    public ReadableAdapt1 (RandomDoubles randomDoubles){
        this.randomDoubles = randomDoubles;
    }

    public ReadableAdapt1 (RandomDoubles randomDoubles, int count){
        this.randomDoubles = randomDoubles;
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;
        }

        String res = Double.toString(randomDoubles.next());
        cb.append(res);
        return res.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new ReadableAdapt1(new RandomDoubles(), 10));
        while (s.hasNext()){
            print(s.next());
        }
    }
}
