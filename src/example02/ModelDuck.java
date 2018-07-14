package example02;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
