package example11;

import java.util.Random;

public class HasQuarter implements State {
    GumballMachine gumballMachine;
    Random generator = new Random();

    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已经投入25美分");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在为您退钱,请取走您的25美分");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("正在为您摇动手柄");
        int winner = generator.nextInt(10);
        if ((winner == 6) && gumballMachine.count>1){
            gumballMachine.setState(gumballMachine.getWinnerState());

        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("没有糖果在发放");
    }
}
