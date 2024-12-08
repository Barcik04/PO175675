package zad21;

public class Client implements Comparable<Client>{
    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Client other) {
        if (this.balance != other.balance) {
            return Double.compare(this.balance, other.balance);
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "name: " + lastName + ", balance: " + balance;
    }
}
