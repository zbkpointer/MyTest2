package com.iron;

public class Demo {

    public static int division(int a,int b) {
        int result = Integer.MAX_VALUE;
        try {
            result = a / b;
        }catch (Exception e){
            System.err.println("错误原因是："+e.getMessage());
        }

        return result;
    }


    public static void main(String[] args) {

            int result = Demo.division(6, 0);
            System.out.println(result);

    }
}
