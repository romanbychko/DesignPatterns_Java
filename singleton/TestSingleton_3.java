package com.pavlo.singleton;

public class TestSingleton_3 {

    public static final TestSingleton_3 instance = new TestSingleton_3();
    
    private TestSingleton_3() {
    }

    public void print(){
        System.out.println(this);
    }
    
    public void stop(){
        System.out.println("stop");
    }

}
