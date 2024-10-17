public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0);

        account1.deopsit(1000);
        System.out.println(account1.getBalance());
        account1.widthdraw(1110);
        System.out.println(account1.getBalance());
    }
}