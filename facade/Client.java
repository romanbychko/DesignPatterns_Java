package com.pavlo.facade;

public class Client {

    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
