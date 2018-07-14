package example08;

public class Light {
    private String name;
    public Light(String s){
        this.name = s;
    }
    public void on(){
        System.out.println(this.name+": Light is on!");
    }

    public void off(){
        System.out.println(this.name+":Light is off!");
    }
}
