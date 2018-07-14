package com.iron;

public class ArrayWriter implements Runnable {

    private final SimpleArray sharedSimpleArray;

    private final int startValue;

    public ArrayWriter(int startValue,SimpleArray array) {
        this.sharedSimpleArray = array;
        this.startValue = startValue;
    }

    @Override
    public void run() {
        for (int i = startValue;i<startValue+3;i++){
            sharedSimpleArray.add(i);
        }
    }
}
