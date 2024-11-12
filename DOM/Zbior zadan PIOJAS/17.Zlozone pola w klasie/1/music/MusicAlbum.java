package music;

import java.util.List;
import java.util.Objects;

public class MusicAlbum {
    protected String title;
    protected String artist;
    protected List<Double> ratings;

    public MusicAlbum(String title, String artist, List<Double> ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
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

    public List<Double> getRatings() {
        return ratings;
    }

    public void setRatings(List<Double> ratings) {
        this.ratings = ratings;
    }


    public void addRating(double rating) {
        this.ratings.add(rating);
    }

    public void removeRating(int index) {
        this.ratings.remove(index);
    }

    public String toString() {
        return "Title: " + title + ", Artist: " + artist + "\nRatings: " + ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicAlbum that)) return false;
        return Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }
}
