package example05;

public abstract class Beverage {
    String description = "Unknown beverage";
    private static int Tall = 1;
    private static int Middle = 2;
    private static int Small = 3;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public int getSize() {
        return size;
    }
}
