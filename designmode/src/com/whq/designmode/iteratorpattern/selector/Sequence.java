package com.whq.designmode.iteratorpattern.selector;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 15:36
 * @desc: 迭代器具体的实现角色
 */
public class Sequence {
    private int curosr;//默认初始值0
    private Object[] objects;

    Sequence(int size){this.objects = new Object[size];}

    public void add(Object x){
        if(curosr < objects.length ){
            objects[curosr++] = x;
        }
    }

    private class SequenceSelector implements Selector{
        private int index;
        @Override
        public boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public Object next() {
            Object o = null;
            if(index < objects.length){
                o = objects[index];
                index++;
            }
            return o;
        }
        //使用.this关键字返回外部类对象引用
        public Sequence getSequence(){
            return Sequence.this;
        }
    }

    public Selector iterator(){
        return  new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }

        Selector s = sequence.iterator();
        while (s.hasNext()){
            print(s.next());
        }

        Sequence.SequenceSelector ss = sequence.new SequenceSelector();
        //对象引用sequence与内部类返回的外部类对象引用为同一个
        print(sequence == ss.getSequence());
    }
}
