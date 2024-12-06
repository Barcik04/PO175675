package zad3;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Client implements Comparable<Client> {
    private String name;
    private int clientNumber;
    private Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    @Override
    public int compareTo(Client other) {
        return other.lastLogin.compareTo(this.lastLogin); // Sortowanie malejąco
    }

    @Override
    public String toString() {
        return "name= " + name + ", clientNumber=" + clientNumber + ", lastLogin=" + lastLogin;
    }

    public static void main(String[] args) {
        Client[] clients = {
            new Client("Alice", 1, new Date(123, Calendar.DECEMBER, 3)),
            new Client("Bob", 2, new Date(1680422400000L)),
            new Client("Charlie", 3, new Date(1669852800000L)),
            new Client("Diana", 4, new Date(1675119600000L)),
            new Client("Eve", 5, new Date(1683007200000L))
        };

        Arrays.sort(clients);

        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
