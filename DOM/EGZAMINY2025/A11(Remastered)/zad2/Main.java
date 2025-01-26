package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>(Arrays.asList(
                new Song("Song A", "Artist Z", 300),
                new Song("Song B", "Artist Y", 250),
                new Song("Song C", "Artist X", 400),
                new Song("Song D", "Artist Y", 200),
                new Song("Song E", "Artist Z", 350)
        ));

        songs.sort(new DurationComparator());
        System.out.println("Posortowane po długości:");
        songs.forEach(System.out::println);

        songs.sort(new ArtistTitleComparator());
        System.out.println("\nPosortowane po artyście i tytule:");
        songs.forEach(System.out::println);
    }
}
