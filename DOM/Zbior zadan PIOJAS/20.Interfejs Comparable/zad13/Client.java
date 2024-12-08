package zad13;

import java.time.LocalDate;
import java.util.Arrays;

public class Client implements Comparable<Client>{
    private String name;
    private double balance;
    private LocalDate lastPurchaseDate;

    public Client(String name, double balance, LocalDate lastPurchaseDate) {
        this.name = name;
        this.balance = balance;
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    @Override
    public int compareTo(Client other) {
        if (this.balance != other.balance) {
            return Double.compare(other.balance, this.balance);
        }
        return this.lastPurchaseDate.compareTo(other.lastPurchaseDate);
    }

    @Override
    public String toString() {
        return "name: " + name + ", balance: " + balance + ", lastPurchaseDate: " + lastPurchaseDate;
    }


    public static void main(String[] args) {
        Client[] clients = {
                new Client("Igor", 97821.20, LocalDate.of(2005, 12,2)),
                new Client("Martin", 971.20, LocalDate.of(2000, 2,20)),
                new Client("Bolo", 971.20, LocalDate.of(2001, 8,17))
        };

        Arrays.sort(clients);

        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
