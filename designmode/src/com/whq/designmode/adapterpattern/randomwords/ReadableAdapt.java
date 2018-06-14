package com.whq.designmode.adapterpattern.randomwords;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 8:45
 * @desc: 将RandomDoubles类适配应用到Scanner
 */
public class ReadableAdapt extends RandomDoubles implements Readable {
    private int count;

    public ReadableAdapt(int count){this.count = count;}
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;
        }
        String res = Double.toString(next());
        cb.append(res);
        return res.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new ReadableAdapt(10));

        while (s.hasNext()){
            print(s.next());
        }
    }
}
