package music;

import java.util.List;
import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    protected String rockGenre;

    public RockAlbum(String title, String artist, List<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }


    @Override
    public java.lang.String toString() {
        return super.toString() + "\ngenre: " + rockGenre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RockAlbum rockAlbum)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rockGenre);
    }
}
