public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deopsit(double amount) {
        this.balance += amount;
    }

    public void widthdraw(double amount) {
        this.balance -= amount;
        if (this.balance < 0) {
            this.balance += amount;
            System.out.println("Insufficient funds. Your Balnce is: " + this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
