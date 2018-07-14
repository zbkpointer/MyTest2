package example06;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);//可以让工厂自己加工

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      //  System.out.println(pizza.cost());

        return pizza;



    }
    abstract Pizza createPizza(String type);//为了方便加盟pizza店
}
