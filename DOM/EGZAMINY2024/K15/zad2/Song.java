package zad2;

public record Song(String title, String artist, int duration) {
    @Override
    public String toString() {
        return "title: " + title + ", artist: " + artist + ", duration: " + duration;
    }
}
