package com.iron;


//import java.lang.String;
public class GenericTest {

    public static void printArray(Integer[] integers) {
        for (Integer element:integers
             ) {
            System.out.printf("%d--",element);

        }
        System.out.println();
    }

    public static void printArray(Double[] doubles) {
        for (Double element:doubles
                ) {
            System.out.printf("%f--",element);

        }
        System.out.println();
    }

    public static void printArray(String[] strings) {
        for (String element:strings
                ) {
            System.out.printf("%s--",element);

        }
        System.out.println();
    }

    public static <E> void printArray(E[] es){

        for (E element:es
             ) {
            System.out.printf("%s-",element);
        }
        System.out.println();
    }

    public static <T extends Comparable<T> > T maxnum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }

        if(z.compareTo(max)>0){
            max = z;
        }

        return max;
    }


    public static void main(String[] args) {
        Integer[] integerArray={1,2,3,4,5,6,7,8};
        String[] stringArray={"a", "b", "c", "d"};
        Double[] doubleArray={1.1,2.2,3.3};
       // printArray(integerArray);
       // printArray(stringArray);
       // outPutArray(integerArray);
       // outPutArray(doubleArray);
      //  outPutArray(stringArray);
        System.out.println(maxnum(1,2,3));
        System.out.println(maxnum("a","b","c"));

    }
}
