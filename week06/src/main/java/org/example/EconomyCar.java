package org.example;

/**
 * Represents an EconomyCar, a subclass of Car.
 */
public class EconomyCar extends Car {
  /**
     * Constructs an EconomyCar object with the specified brand, model, and license plate.
     *
     * @param brand The brand of the car
     * @param model The model of the car
     * @param licensePlate The license plate of the car
     */
  public EconomyCar(String brand, String model, String licensePlate) {
    super(brand, model, licensePlate);
  }

  /**
     * Gets the base rental price for the economy car.
     *
     * @return The base rental price
     */
  @Override
  protected double getBasePrice() {
    return 50;
  }
}
