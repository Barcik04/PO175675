package zad21;

import java.util.ArrayList;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Kowalski", 999.9));
        clients.add(new Client("Krysinski", 999.9));
        clients.add(new Company("Marciniak & Sons", .92, 27));
        clients.add(new Company("Abakus", 18003.0, 27));
        clients.add(new Company("Marciniak & Sons", .92, 28));


        clients.sort(null);

        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
