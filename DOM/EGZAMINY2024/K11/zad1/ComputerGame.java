package zad1;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings != null ? Arrays.copyOf(ratings, ratings.length) : new double[0];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings != null ? Arrays.copyOf(ratings, ratings.length) : new double[0];
    }

    public void addRating(double rating) {
        double[] newRatings = new double[ratings.length + 1];
        System.arraycopy(ratings, 0, newRatings, 0, ratings.length);
        newRatings[ratings.length] = rating;
        ratings = newRatings;
    }

    public void removeRating(int idx) {
        if (idx < 0 || idx >= ratings.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }

        double[] newRatings = new double[ratings.length - 1];
        for (int i = 0, j = 0; i < ratings.length; i++) {
            if (i != idx) {
                newRatings[j++] = ratings[i];
            }
        }
        ratings = newRatings;
    }

    @Override
    public String toString() {
        return ComputerGame.class.getName() + title + ", " + producer + ", " + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }
}
