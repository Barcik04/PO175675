package zad2;

import java.util.Objects;

public class BirdGame implements Comparable<BirdGame>{
    private String name;
    private String genre;
    private int playTime;

    public BirdGame(String name, String genre, int playTime) {
        this.name = name;
        this.genre = genre;
        this.playTime = playTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "name: " + name + ", genre: " + genre + ", play time: " + playTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirdGame birdGame = (BirdGame) o;
        return Objects.equals(name, birdGame.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(BirdGame o) {
        return this.name.compareTo(o.name);
    }
}
