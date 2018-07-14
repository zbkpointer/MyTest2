package example07;

import java.util.Random;

public class CreateChocolateBoiled implements Runnable{
    private static Random generator = new Random();
    @Override
    public void run() {

        try {
            ChocolateBoiled chocolateBoiled = ChocolateBoiled.getChocolateBoiled();
            Thread.sleep(generator.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
