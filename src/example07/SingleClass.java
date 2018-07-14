package example07;

public class SingleClass {

    private static SingleClass singleClass;
    public int a =1;

    private SingleClass(){

    }

    public static SingleClass getSingleClass(){
        if (singleClass == null){
            singleClass = new SingleClass();
            return singleClass;
        }
        else {
            return singleClass;
        }
    }

}
