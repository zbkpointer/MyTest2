package com.iron;

public class ThreadCreator {
    public static void main(String[] args) {
        System.out.println("创建线程");

        Thread thread1 = new Thread(new PrintTask("task1"));
        Thread thread2 = new Thread(new PrintTask("task2"));
        Thread thread3 = new Thread(new PrintTask("task3"));

        System.out.println("线程创建完成，开启任务");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("任务开始，主程序结束");
    }
}
