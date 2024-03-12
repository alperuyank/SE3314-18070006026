package org.example;

/**
 * The Customer class represents a customer in a bank.
 */
public class Customer {
    private final String name;
    private final double initialDeposit;

    /**
     * Creates a new Customer object with a name and an initial deposit.
     *
     * @param name The name of the customer.
     * @param initialDeposit The initial deposit of the customer.
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the initial deposit of the customer.
     *
     * @return The initial deposit of the customer.
     */
    public double getInitialDeposit() {
        return initialDeposit;
    }

}