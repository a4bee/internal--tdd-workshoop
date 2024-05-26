import { expect } from 'chai';
import BankingSystem from '../../service/BankingSystem.js';

const ACCOUNT_NUMBER_1 = '123456';
const ACCOUNT_NUMBER_2 = '987654';

describe('BankingSystem', () => {
  let bankingSystem;

  beforeEach(() => {
    bankingSystem = new BankingSystem();
    bankingSystem.createAccount(ACCOUNT_NUMBER_1);
  });

  it('should create an account', () => {
    bankingSystem.createAccount(ACCOUNT_NUMBER_2);
    expect(bankingSystem.numberOfAccounts()).to.equal(2);
  });

  it('should deposit funds', () => {
    bankingSystem.depositFunds(ACCOUNT_NUMBER_1, 100.03);
    expect(bankingSystem.checkBalance(ACCOUNT_NUMBER_1)).to.equal(100.03);
  });

  it('should withdraw funds', () => {
    bankingSystem.depositFunds(ACCOUNT_NUMBER_1, 100.03);
    bankingSystem.withdrawFunds(ACCOUNT_NUMBER_1, 50.04);
    expect(bankingSystem.checkBalance(ACCOUNT_NUMBER_1)).to.equal(49.99);
  });

  it('should check balance', () => {
    expect(bankingSystem.checkBalance(ACCOUNT_NUMBER_1)).to.equal(0);
  });
});