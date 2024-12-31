package zad2;

public class TestSong {
    public static void main(String[] args) {
        Song song1 = new Song("Birds of the Feather", "Billie Eilish", 182);
        Song song2 = new Song("Birds of the Feather", "Billie Eilish", 199);

        System.out.println(song1.compareTo(song2));
        System.out.println(song1.equals(song2));
    }
}
