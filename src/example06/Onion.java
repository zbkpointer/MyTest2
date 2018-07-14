package example06;

public class Onion extends CondimentPizza {
    Pizza pizza;

    public Onion(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+"洋葱";
    }

    @Override
    double cost() {
        return pizza.cost()+0.88;
    }
}
