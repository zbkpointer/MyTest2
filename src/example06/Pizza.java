package example06;

public abstract class Pizza {
    String desc = "Unknown";

    public void prepare(){
        System.out.println("准备......");
    }
    public void bake(){
        System.out.println("烘烤中.......");
    }
    public void cut(){
        System.out.println("切成8片");
    }
    public void box(){
        System.out.println("装成盒子，成功，开始出售");
    }

    abstract double cost();

    public String getDesc() {
        return desc;
    }
}
