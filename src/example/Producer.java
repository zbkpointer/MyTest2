package example;

import java.util.Random;

public class Producer implements Runnable {
    private final static Random generator = new Random();
    private final Buffer shareLocation;

    public Producer(Buffer shareLocation) {
        this.shareLocation = shareLocation;
    }


    @Override
    public void run() {
        int sum = 0;
        for (int count =1;count <=10;count++){
            try {
                Thread.sleep(generator.nextInt(3000));
                shareLocation.set(count);
                sum+=count;
              //  System.out.printf("\t\t\t%2d\n",sum);
            }catch (InterruptedException e){

            }
        }
       System.out.println("写入完毕");
    }
}
