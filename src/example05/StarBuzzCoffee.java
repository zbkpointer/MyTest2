package example05;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description+"$"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
    }
}
