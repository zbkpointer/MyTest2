package example11;

import java.util.Random;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("别再塞钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您已经摇动手柄");
    }

    @Override
    public void turnCrank() {
        System.out.println("摇一次就OK啦");

    }

    @Override
    public void dispense() {
        System.out.println("恭喜获得两个糖果");
        gumballMachine.releaseBall();
        gumballMachine.releaseBall();
        if (gumballMachine.count>0){
            gumballMachine.setState(gumballMachine.getNoQuarter());

        }else {
            System.out.println("没有糖果了!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
