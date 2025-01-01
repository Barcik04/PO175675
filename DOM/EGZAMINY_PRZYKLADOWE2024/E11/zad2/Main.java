package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Hobbit", "Eilish", 99));
        songs.add(new Song("Alle", "Eilish", 102));
        songs.add(new Song("Bibby", "Eilish", 99));

        Collections.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
