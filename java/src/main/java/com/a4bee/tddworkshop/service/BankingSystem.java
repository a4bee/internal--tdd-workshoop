package com.a4bee.tddworkshop.service;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private final Map<String, Double> accounts;

    public BankingSystem() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber) {
        System.out.printf("Add account: %s%n", accountNumber);
        accounts.computeIfAbsent(accountNumber, (createAccountNumber -> 0.0d));
    }

    public void depositFunds(String accountNumber, double amount) {
        System.out.printf("Deposit founds: %.2f%n", amount);
        accounts.computeIfPresent(accountNumber,
                (depositAccountNumber, accountBalance) -> accountBalance + amount);
    }

    public void withdrawFunds(String accountNumber, double amount) {
        System.out.printf("Withdraw founds: %.2f%n", amount);
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
        }
    }

    public double checkBalance(String accountNumber) {
        double accountBalance = accounts.getOrDefault(accountNumber, 0.0);
        System.out.printf("Check balance: %.2f%n", accountBalance);
        return accountBalance;
    }

    public int getNumberOfAccounts() {
        return this.accounts.size();
    }
}