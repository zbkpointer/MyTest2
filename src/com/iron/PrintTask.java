package com.iron;

import java.util.Random;

public class PrintTask implements Runnable{

    private final int sleepTime ;
    private final String taskName;
    private final static Random generator = new Random();

    public PrintTask(String name) {
        taskName = name;
        sleepTime = generator.nextInt(5000);
    }


    @Override
    public void run() {

        try {
            System.out.println(taskName+"将要睡眠"+sleepTime+"毫秒");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName+"完成睡眠");
    }
}
