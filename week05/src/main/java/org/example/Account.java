package org.example;

/**
 * The Account class represents an account for a customer in a bank.
 */
public class Account {
    private Customer customer;
    private double balance;

    /**
     * Creates a new Account object for a customer.
     *
     * @param customer The customer for whom the account is being created.
     */
    public Account(Customer customer) {
        this.customer = customer;
        this.balance = customer.getInitialDeposit();
    }

    /**
     * Deposits money into the account.
     *
     * @param amount The amount of money to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount The amount of money to withdraw.
     * @return True if the withdrawal was successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks the balance of the account.
     *
     * @return The balance of the account.
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * Gets the customer associated with this account.
     *
     * @return The customer associated with this account.
     */
    public Customer getCustomer() {
        return customer;
    }
}