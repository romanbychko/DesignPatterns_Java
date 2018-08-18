package com.pavlo.abstractFactory;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true) {
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();  
        
    }

}
