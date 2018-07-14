package example11;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已经卖完");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果已经卖完");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已经卖完");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已经卖完");
    }
}
