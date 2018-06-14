package com.whq.designmode.adapterpattern.randomwords;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/13 17:28
 * @desc: 测试Scanner类的Scanner(Readable readable)构造方法
 */
public class RandomWords implements Readable {
    private Random random = new Random(47);

    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static final char[] vowels = "aeiou".toCharArray();

    private int count;

    public RandomWords(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;
        }

        cb.append(capitals[random.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }

        cb.append(" ");

        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()) {
            print(s.next());
        }
    }
}
