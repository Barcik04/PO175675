package zad1;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Hobbit", "Billie", 21),
                new Song("Lobbot", "Rocky", 20),
                new Song("Wurst", "Billie", 21),
        };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
