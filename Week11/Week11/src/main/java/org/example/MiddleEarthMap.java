package org.example;

/**
 * Represents the Middle Earth map with navigation capabilities.
 */
public class MiddleEarthMap {
    public MiddleEarthMap() {
    }

    /**
     * Navigates to the specified location with optional secret passage.
     *
     * @param location The location to navigate to.
     * @param isSecretPassage Indicates whether to take a secret passage.
     */
    public void navigate(final String location,final boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break; // Added missing break
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break; // Added missing break
            case "Rohan":
                System.out.println("Navigating to Rohan");
                break;
            default:
                System.out.println("Unknown location");
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        if (isSecretPassage) {
            System.out.println(result);
        }
    }
}
