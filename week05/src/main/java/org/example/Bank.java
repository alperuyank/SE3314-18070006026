package org.example;

/**
 * The Bank class represents a bank that manages accounts for customers.
 */
public class Bank {
    private Account[] accounts;
    private int numAccounts;

    /**
     * Creates a new Bank object.
     */
    public Bank() {
        accounts = new Account[10];
        numAccounts = 0;
    }

    /**
     * Creates an account for a customer.
     *
     * @param customer The customer for whom the account is being created.
     * @return The created account.
     */
    public Account createAccount(Customer customer) {
        Account account = new Account(customer);
        if (numAccounts == accounts.length) {
            Account[] newAccounts = new Account[accounts.length * 2];
            System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);
            accounts = newAccounts;
        }
        accounts[numAccounts] = account;
        numAccounts++;
        return account;
    }

    /**
     * Retrieves an account for a customer.
     *
     * @param customerName The name of the customer whose account is being retrieved.
     * @return The retrieved account, or null if no account exists for the customer.
     */
    public Account retrieveAccount(String customerName) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getCustomer().getName().equals(customerName)) {
                return accounts[i];
            }
        }
        return null;
    }
}
