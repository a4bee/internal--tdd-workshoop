package com.a4bee.tddworkshop.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankingSystemTest {

    private final String ACCOUNT_NUMBER_1 = "123456";
    private final String ACCOUNT_NUMBER_2 = "789012";

    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp() {
        bankingSystem = new BankingSystem();
        bankingSystem.createAccount(ACCOUNT_NUMBER_1);
    }

    @Test
    void testCreateAccount() {
        bankingSystem.createAccount(ACCOUNT_NUMBER_2);
        assertEquals(2, bankingSystem.getNumberOfAccounts());
    }

    @Test
    void testDepositFunds() {
        bankingSystem.depositFunds(ACCOUNT_NUMBER_1, 100.23d);
        assertEquals(100.23d, bankingSystem.checkBalance(ACCOUNT_NUMBER_1));
    }

    @Test
    void testWithdrawFunds() {
        bankingSystem.depositFunds(ACCOUNT_NUMBER_1, 100.01d);
        bankingSystem.withdrawFunds(ACCOUNT_NUMBER_1, 50.02d);
        assertEquals(49.99d, bankingSystem.checkBalance(ACCOUNT_NUMBER_1));
    }

    @Test
    void testCheckBalance() {
        assertEquals(0.0d, bankingSystem.checkBalance(ACCOUNT_NUMBER_1));
    }
}