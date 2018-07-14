package example11;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等一下，正在为你准备一个糖果");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您已经摇动手柄");
    }

    @Override
    public void turnCrank() {
        System.out.println("摇动两次也得不到两个糖果");
    }

    @Override
    public void dispense() {

        gumballMachine.releaseBall();

        if (gumballMachine.count>0){
            gumballMachine.setState(gumballMachine.getNoQuarter());

        }else {
            System.out.println("没有糖果了!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
