package com.pavlo.singleton;

public class TestSingleton_1 {

    private static TestSingleton_1 instance;

    public static synchronized TestSingleton_1 getInstance() {
        if (instance == null) {
            instance = new TestSingleton_1();
        }
        return instance;
    }
    
    private TestSingleton_1() {}

    public void print(){
        System.out.println(this);
    }
    
    public void stop(){
        System.out.println("stop");
    }

}
