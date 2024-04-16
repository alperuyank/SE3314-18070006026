package org.example;

public class Test {
    public static void main(String[] args) {
        // Test EconomyCar
        Car economyCar = new EconomyCar("Toyota", "Corolla", "ABC123");
        economyCar.addAdditionalFeature(new Gps());
        economyCar.addAdditionalFeature(new LeatherSeats());
        double economyCarPrice = economyCar.getRentalPrice(5);
        System.out.println("EconomyCar rental price for 5 days: $" + economyCarPrice);

        // Test LuxuryCar
        Car luxuryCar = new LuxuryCar("BMW", "X5", "XYZ789");
        luxuryCar.addAdditionalFeature(new Gps());
        luxuryCar.addAdditionalFeature(new LeatherSeats());
        double luxuryCarPrice = luxuryCar.getRentalPrice(7);
        System.out.println("LuxuryCar rental price for 7 days: $" + luxuryCarPrice);
    }
}
