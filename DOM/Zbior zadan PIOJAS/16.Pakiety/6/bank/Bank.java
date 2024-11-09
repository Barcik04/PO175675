package bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    public List<Account> accounts = new ArrayList<>();

    public Account createAccount(int accountNumber, double balance) {
        Account account = new Account(accountNumber, balance);
        accounts.add(account);
        return account;
    }

    public void moneyTransfer(Account from, Account to, double amount) {
        if (from.getBalance() < amount) {
            System.out.println("Your balance is only " + from.getBalance());
        } else {
            from.withdraw(amount);
            System.out.println("Your balance is now " + from.getBalance());
            to.deposit(amount);
            System.out.println("Targeted account balance is now " + to.getBalance());
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }


    public void displayAccounts() {
        for (Account acc : accounts) {
            System.out.println("acc number: " + acc.getAccountNumber() + " acc balance: " + acc.getBalance());
        }
    }
}
