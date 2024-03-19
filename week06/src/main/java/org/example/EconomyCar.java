package org.example;

public class EconomyCar extends Car {
    public EconomyCar(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    protected double getBasePrice() {
        return 50;
    }
}

