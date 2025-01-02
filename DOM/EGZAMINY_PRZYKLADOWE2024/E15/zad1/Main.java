package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Rock", "Rap", "Phonk", "R&B"));

        VinylStore vinylStore = new VinylStore("Tunessss", "Olsztyn", list);

        vinylStore.addAlbum("Jury Boy");
        vinylStore.removeAlbum("Rock");

        System.out.println(vinylStore);
    }
}
