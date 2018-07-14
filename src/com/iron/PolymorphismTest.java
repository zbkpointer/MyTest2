package com.iron;


class superA{

    protected void talk(){
        System.out.println("I am superA");
    }
}

class B extends superA{
    @Override
    protected void talk() {
       // super.talk();
       System.out.println("I am B");
    }
}
class C extends B{
    @Override
    protected void talk() {
        System.out.println("I am C");
    }
}

public class PolymorphismTest {
    public static void main(String[] args) {
        superA b = new B();
        superA c = new C();
        b.talk();
        c.talk();
    }
}
