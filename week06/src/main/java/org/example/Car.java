package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class Car {
    private String brand;
    private String model;
    private String licensePlate;
    private List<AdditionalFeature> additionalFeatures;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.additionalFeatures = new ArrayList<>();
    }

    /**
     *
     * @param feature object
     */
    public void addAdditionalFeature(AdditionalFeature feature) {
        additionalFeatures.add(feature);
    }

    /**
     * Calculates the total rental price for the car.
     * @param days The number of days for the rental period
     * @return The total rental price
     */
    public double getRentalPrice(int days) {
        double basePrice = getBasePrice();
        double additionalPrice = 0;
        for (AdditionalFeature feature : additionalFeatures) {
            additionalPrice += feature.getPricePerDay();
        }
        return basePrice * days + additionalPrice * days;
    }
    /**
     * Gets the base rental price for the car.
     * @return The base rental price
     */

    protected abstract double getBasePrice();
}

