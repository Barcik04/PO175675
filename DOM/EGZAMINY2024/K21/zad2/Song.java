package zad2;

public class Song implements Comparable<Song>{
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
        return "title " + title + " artist " + artist + " duration " + duration;
    }

    @Override
    public int compareTo(Song o) {
        int result = Integer.compare(this.duration, o.duration);
        if (result == 0) {
            return o.title.compareTo(this.title);
        }
        return result;
    }
}
