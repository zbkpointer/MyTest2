package example11;

public class NoQuarter implements State {

    GumballMachine gumballMachine;

    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您还没有25美分，请投入25美分");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没有投入25美分");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能摇动手柄");
    }

    @Override
    public void dispense() {
        System.out.println("需要先付钱");
    }
}
