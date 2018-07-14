package example06;

public class NYStylePizza extends Pizza {
    @Override
    public String getDesc() {
        return "纽约氏比萨";
    }

    public NYStylePizza(){

    }
    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        System.out.println("这是纽约氏比萨，切成20片");
    }

    @Override
    public void box() {
        super.box();
    }

    @Override
    double cost() {
        return 0.99;
    }
}
