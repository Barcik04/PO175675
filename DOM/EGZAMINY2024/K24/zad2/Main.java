package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Hobbit", "Bob", 199));
        songs.add(new Song("Abbol", "Bob", 199));
        songs.add(new Song("Jonasz", "Bob", 11));
        songs.add(new Song("Sea level", "Bob", 12));
        songs.add(new Song("Bait Boy", "Bob", 12));

        Collections.sort(songs);
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
