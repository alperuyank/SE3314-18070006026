package org.example;

/**
 * Represents a LuxuryCar, a subclass of Car.
 */
public class LuxuryCar extends Car {
  /**
     * Constructs a LuxuryCar object with the specified brand, model, and license plate.
     *
     *  @param brand The brand of the car
     * @param model The model of the car
     * @param licensePlate The license plate of the car
     */
  public LuxuryCar(String brand, String model, String licensePlate) {
    super(brand, model, licensePlate);
  }
  /**
     * Gets the base rental price for the luxury car.
     *
     *  @return The base rental price
     */

  @Override
  protected double getBasePrice() {
    return 100;
  }
}
