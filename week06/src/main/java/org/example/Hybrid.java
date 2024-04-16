package org.example;

/**
 * Represents a Hybrid feature as an AdditionalFeature.
 */
public class Hybrid implements AdditionalFeature {
  /**
     * Gets the price per day for the Hybrid feature.
     *
     *  @return The price per day for Hybrid
     */
  @Override
  public double getPricePerDay() {
    return 10;
  }
}
