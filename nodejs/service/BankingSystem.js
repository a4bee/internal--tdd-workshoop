class BankingSystem {

  constructor() {
    this.accounts = new Map();
  }

  createAccount(accountNumber) {
    if (!this.accounts.has(accountNumber)) {
      console.log("Add account: %s", accountNumber);
      this.accounts.set(accountNumber, 0);
    }
  }

  depositFunds(accountNumber, amount) {
    if (this.accounts.has(accountNumber)) {
      console.log("Deposit founds: %d", amount)
      this.accounts.set(accountNumber, this.accounts.get(accountNumber) + amount);
    }
  }

  withdrawFunds(accountNumber, amount) {
    if (this.accounts.has(accountNumber) && this.accounts.get(accountNumber) >= amount) {
      console.log("Withdraw founds: %d", amount)
      this.accounts.set(accountNumber, this.accounts.get(accountNumber) - amount);
    }
  }

  checkBalance(accountNumber) {
    const accountBalance = this.accounts.get(accountNumber) || 0;
    console.log("Account balance: %d", accountBalance);
    return accountBalance;
  }

  numberOfAccounts() {
    return this.accounts.size;
  }
}

export default BankingSystem;
