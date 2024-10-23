public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        if (accountNumber.length() != 26) {
            this.accountNumber = "11111111111111111111111111";
        } else {
            this.accountNumber = accountNumber;
        }

        if (this.balance < 0) {
            System.out.println("Invalid balance");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount=" + balance + ", accountNumber=" + accountNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1500, "213123123");
        System.out.println(bankAccount);
    }
}
