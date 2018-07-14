package example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Buffer sharedLocation = new BlockingBuffer();

        executor.execute(new Producer(sharedLocation));
        executor.execute(new Consumer(sharedLocation));
        executor.shutdown();

        try{
            boolean taskEnd = executor.awaitTermination(3,TimeUnit.MINUTES);
            if(taskEnd){
                System.out.println("执行完毕");
            }
            else {
                System.out.println("执行中断");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // System.out.println(Consumer.sum);
    }
}
