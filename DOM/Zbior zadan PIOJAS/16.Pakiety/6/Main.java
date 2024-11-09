import bank.Account;
import bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc = bank.createAccount(9911, 8200.29);
        Account acc2 = bank.createAccount(4411, 6300.98);
        bank.displayAccounts();

        System.out.println("\n");

        bank.moneyTransfer(acc, acc2, 9000.0);
        acc.deposit(1000);
        bank.moneyTransfer(acc, acc2, 9000.0);
    }
}
