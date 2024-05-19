package com.a4bee.tddworkshop;

import com.a4bee.tddworkshop.service.BankingSystem;

public class Main {
    public static void main(String[] args) {
        final String ACCOUNT_NUMBER = "11284";

        System.out.println("Start banking system");
        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.createAccount(ACCOUNT_NUMBER);
        bankingSystem.depositFunds(ACCOUNT_NUMBER, 177.23d);
        bankingSystem.checkBalance(ACCOUNT_NUMBER);
        bankingSystem.withdrawFunds(ACCOUNT_NUMBER, 10.03d);
        bankingSystem.checkBalance(ACCOUNT_NUMBER);
    }
}