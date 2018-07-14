package example06;

public class NYPizzaFactory extends PizzaStore {
    Pizza pizza ;


    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new NYStylePizza();
        }else if(type.equals("milk"))
            pizza = new NYStylePizza();
        return pizza;
    }


}
