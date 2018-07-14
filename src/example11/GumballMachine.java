package example11;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numOfGumballs){
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = numOfGumballs;
        if (count > 0){
            this.state = noQuarterState;
        }
    }

    public void insertQuarter(){
        this.state.insertQuarter();
    }


    public void ejectQuarter(){
        this.state.ejectQuarter();
    }
    public void turnCrank(){
        this.state.turnCrank();
        this.state.dispense();
    }

    public State getNoQuarter() {
        return noQuarterState;
    }

    public void setNoQuarter(State noQuarter) {
        this.noQuarterState = noQuarter;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void releaseBall(){
        System.out.println("一个糖果从卡槽中出来");
        if(count!=0){
            count = count - 1;
        }
    }

    public void reload(int numOfGumballs){
        this.count = numOfGumballs;
        this.state = noQuarterState;
    }

}
