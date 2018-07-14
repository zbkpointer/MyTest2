package example11;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine.getState().toString());
            System.out.println("-----------------");
        }

        gumballMachine.reload(5);

        for (int i = 0; i < 5; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine.getState().toString());
            System.out.println("-----------------");
        }


    }
}
