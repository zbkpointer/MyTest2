package com.iron;

public class Person {
    private String name;
    private String addr;
    private char sex;
    private int age;

    public Person(String name, String addr, char sex, int age) {

        System.out.println(name);
        System.out.println(addr);
        System.out.println(sex);
        System.out.println(age);

    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
