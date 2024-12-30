package zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song[] songs = {
            new Song("Hobbit", "Tolkien", 99),
                new Song("Boliir", "Tolkien", 119),
                new Song("Bobboi", "Tolkien", 99),
                new Song("Toy Story", "Tolkien", 122),
                new Song("Hobbit II", "Tolkien", 89)
        };

        Arrays.sort(songs, new DurationTitleComparator());
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
