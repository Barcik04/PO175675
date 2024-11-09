package bank;

public class Account {
    private int accountNumber;
    private double balance;


    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
