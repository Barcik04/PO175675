import music.RockAlbum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(List.of(3.2, 3.9));

        RockAlbum album = new RockAlbum("Welcome To The Jungle", "Igor Kabolko", list, "Hard");
        System.out.println(album);
        album.removeRating(1);
        System.out.println(album);
    }
}

