package example02;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
