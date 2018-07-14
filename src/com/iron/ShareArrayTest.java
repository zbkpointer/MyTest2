package com.iron;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShareArrayTest {
    public static void main(String[] args) {
        SimpleArray sharedSimpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1,sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11,sharedSimpleArray);

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);

        executor.shutdown();

        try{
            boolean taskEnd = executor.awaitTermination(1,TimeUnit.MINUTES);
            if(taskEnd){
                System.out.println(sharedSimpleArray);
            }else {
                System.out.println("超时");
            }
        } catch (InterruptedException e) {
            System.out.println("等待任务结束中断");
        }
    }
}
