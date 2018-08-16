package com.pavlo.singleton;

public class Start {

    public static void main(String[] args) {
        TestSingleton_1.getInstance().print();
        TestSingleton_1.getInstance().print();
        TestSingleton_1.getInstance().print();
        
        TestSingleton_1.getInstance().stop();
    }
}
