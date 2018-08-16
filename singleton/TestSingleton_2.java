package com.pavlo.singleton;

public class TestSingleton_2 {

    private static final TestSingleton_2 instance = new TestSingleton_2();

    public static synchronized TestSingleton_2 getInstance() {
        return instance;
    }
    
    private TestSingleton_2() {
    }

    public void print(){
        System.out.println(this);
    }
    
    public void stop(){
        System.out.println("stop");
    }

}
