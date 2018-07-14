package example05;

public class Espresso extends Beverage {
    Beverage beverage;
    private int size;

    @Override
    public int getSize() {
        return super.getSize();
    }

    public Espresso(){
        description = "Espresso";
    }



    @Override
    public double cost() {
        return 1.99;
    }
}
