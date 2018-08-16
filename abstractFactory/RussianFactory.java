package com.pavlo.abstractFactory;

public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
