package example07;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChocolateBoiledTest {
    public static void main(String[] args) {
        int num = 10;
        ArrayList<CreateChocolateBoiled> arrayList = new ArrayList<>();


        for (int i = 0; i <num ; i++) {
            arrayList.add(new CreateChocolateBoiled());
        }

//
//        CreateChocolateBoiled createChocolateBoiled = new CreateChocolateBoiled();
//        CreateChocolateBoiled createChocolateBoiled1 = new CreateChocolateBoiled();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (CreateChocolateBoiled c :
                arrayList) {
            executorService.execute(c);

        }


        executorService.shutdown();









//        ChocolateBoiled chocolateBoiled = ChocolateBoiled.getChocolateBoiled();
//        chocolateBoiled.fill();
//        ChocolateBoiled chocolateBoiled1 = ChocolateBoiled.getChocolateBoiled();
//        chocolateBoiled1.boil();
//        System.out.println(ChocolateBoiled.isBoiled());
    }
}
