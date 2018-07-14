package example02;

public abstract  class Duck {
     public FlyBehaviour flyBehaviour;
     public QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks can swim,even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
