package zad2;

public record Song(String title, String artist, int duration) implements Comparable<Song> {
    @Override
    public int compareTo(Song o) {
        int result = Integer.compare(this.duration, o.duration);
        if (result == 0) result = o.title.compareTo(this.title);
        return result;
    }

    @Override
    public String toString() {
        return "title: " + title + ", artist: " + artist + ", duration: " + duration;
    }
}
