package com.iron;

import java.util.Random;

public class SimpleArray {
    private final int array[];
    private int writeIndex = 0;
    private final static Random generator = new Random();
    private  int sleepTime ;

    public SimpleArray(int size) {
        array = new int[size];


    }

    public  void add(int value){
        int position = writeIndex;
        try{
            sleepTime = generator.nextInt(500);
            System.out.println("睡眠时间为:"+sleepTime);
            //System.out.println("获得索引值:"+writeIndex);
            Thread.sleep(sleepTime);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        array[position]=value;
        System.out.println(Thread.currentThread().getName()+"写"+value+"至位置"+position);
        ++writeIndex;
        System.out.println("下一个写的索引是："+writeIndex);
    }
    public String toString(){
        String arrayString = "\n数组内容是：\n";
        for (int i = 0; i <array.length ; i++) {
            arrayString+=array[i]+" ";
        }
        return arrayString;
    }
}
