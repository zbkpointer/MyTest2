package example07;

public class Test {
    public static void main(String[] args) {

        SingleClass singleClass = SingleClass.getSingleClass();

        System.out.println(singleClass.toString());
        singleClass.a =2;


        SingleClass singleClass1 = SingleClass.getSingleClass();
        System.out.println(singleClass1.toString());
        System.out.println(singleClass1.a);

        if (singleClass.equals(singleClass1)){
            System.out.println("相同");
        }
    }
}
