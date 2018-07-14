package example02;

public class MallardDuck extends Duck{

     public MallardDuck() {
         this.flyBehaviour = new FlyWithWings();
         this.quackBehaviour = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I'am a really mallard duck!");
    }


    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

    }



}
