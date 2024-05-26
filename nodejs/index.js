import BankingSystem from "./service/BankingSystem.js";

const ACCOUNT_NUMBER = "11284";

console.log("Start banking system");
const bankingSystem = new BankingSystem();
bankingSystem.createAccount(ACCOUNT_NUMBER);
bankingSystem.depositFunds(ACCOUNT_NUMBER, 177.23);
bankingSystem.checkBalance(ACCOUNT_NUMBER);
bankingSystem.withdrawFunds(ACCOUNT_NUMBER, 10.03);
bankingSystem.checkBalance(ACCOUNT_NUMBER);
