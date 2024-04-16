package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class representing a generic Car.
 */
abstract class Car {
  final String brand;
  final String model;
  final String licensePlate;
  private final List<AdditionalFeature> additionalFeatures;

  /**
     * Constructs a Car object with the specified brand, model, and license plate.
     *
     *  @param brand The brand of the car.
     * @param model The model of the car.
     * @param licensePlate The license plate of the car.
     */
  public Car(String brand, String model, String licensePlate) {
    this.brand = brand;
    this.model = model;
    this.licensePlate = licensePlate;
    this.additionalFeatures = new ArrayList<>();
  }
  /**
     * Adds an additional feature to the car.
     *
     *  @param feature The additional feature to be added.
     */

  public void addAdditionalFeature(AdditionalFeature feature) {
    additionalFeatures.add(feature);
  }
  /**
     * Calculates the total rental price for the car.
     *
     *  @param days The number of days for the rental period
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
     *
     *  @return The base rental price.
     */
  protected abstract double getBasePrice();
}


