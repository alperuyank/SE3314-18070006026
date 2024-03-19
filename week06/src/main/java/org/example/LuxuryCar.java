package org.example;

public class LuxuryCar extends Car {
    public LuxuryCar(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    protected double getBasePrice() {
        return 100;
    }
}