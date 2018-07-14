package example06;

public class BuyPizza {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        Pizza pizza = nyPizzaFactory.orderPizza("cheese");
        pizza = new Onion(pizza);
        System.out.println("新鲜出炉的......");
        System.out.println(pizza.getDesc());
        System.out.println("花费......");
        System.out.println(pizza.cost());

    }

}
