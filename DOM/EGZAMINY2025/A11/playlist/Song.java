package playlist;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration;
    }

    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Lucid Dreams", "Juice World", 10));
        songs.add(new Song("Ocean Eyes", "Billie Eilish", 22));
        songs.add(new Song("Birds of The Feather", "Billie Eilish", 22));

        songs.sort(new DurationComparator());
        for (Song song : songs) {
            System.out.println(song);
        }

        System.out.println("\n\n");

        songs.sort(new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
