package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Billie", "Eilish", 19));
        songs.add(new Song("Bobby", "The race", 192));
        songs.add(new Song("Loolek", "ish", 12));
        songs.add(new Song("Gongo", "Gigi", 11));
        songs.add(new Song("Billie", "Eilish", 12));

        Collections.sort(songs);
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
