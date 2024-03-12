package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class BankTest extends TestCase {
    @Test
    public void testBankAccount() {
        // Create a new bank
        Bank bank = new Bank();

        // Create a new customer
        Customer customer = new Customer("John Doe", 1000);

        // Create an account for the customer
        Account account = bank.createAccount(customer);

        // Check if the account was created successfully
        assertNotNull(account);

        // Deposit some money
        account.deposit(500);

        // Check if deposit was successful
        assertEquals(1500, account.checkBalance());

        // Withdraw some money
        boolean withdrawSuccess = account.withdraw(300);

        // Check if withdrawal was successful
        assertTrue(withdrawSuccess);
        assertEquals(1200, account.checkBalance());

        // Try to withdraw more money than available
        boolean withdrawFail = account.withdraw(1500);

        // Check if withdrawal fails due to insufficient balance
        assertFalse(withdrawFail);
        assertEquals(1200, account.checkBalance());

        // Retrieve account by customer name
        Account retrievedAccount = bank.retrieveAccount("John Doe");

        // Check if retrieved account is the same as the one created
        assertNotNull(retrievedAccount);
        assertEquals(account, retrievedAccount);
    }
}