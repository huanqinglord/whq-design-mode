package com.whq.designmode.adapterpattern.randomwords;

import java.util.Random;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 8:37
 * @desc: 生成浮点随机数，想办法应用于Scanner类的接口
 */
public class RandomDoubles {
    private static Random random = new Random(47);

    public double next(){return random.nextDouble();}

    public static void main(String[] args) {
        RandomDoubles r = new RandomDoubles();
        for (int i = 0; i < 10; i++) {
            print(r.next());
        }
    }
}
