package org.example;

/**
 * Represents LeatherSeats feature as an AdditionalFeature.
 */
public class LeatherSeats implements AdditionalFeature {
  /**
     * Gets the price per day for the LeatherSeats feature.
     *
     *  @return The price per day for LeatherSeats
     */
  @Override
   public double getPricePerDay() {
    return 30;
  }
}
