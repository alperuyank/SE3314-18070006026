package org.example;

/**
 * Represents a GPS feature as an AdditionalFeature.
 */
public class Gps implements AdditionalFeature {
  /**
     * Gets the price per day for the GPS feature.
     *
     *  @return The price per day for GPS
     */
  @Override
   public double getPricePerDay() {
    return 20;
  }
}
