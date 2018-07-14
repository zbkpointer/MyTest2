package example10;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetable;
    private double price;

    public MenuItem(String name, String description, boolean vegetable, double price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetable() {
        return this.vegetable;
    }

    @Override
    public void print() {
        System.out.printf(" %s",name);

        if (isVegetable()){
            System.out.printf(" %s","<v>");
        }
        System.out.printf(",\t%f",this.price);
        System.out.printf("\t\t---%s\n",this.description);
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
