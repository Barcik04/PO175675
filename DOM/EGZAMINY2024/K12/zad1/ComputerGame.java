package zad1;

import java.util.ArrayList;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private ArrayList<Double> ratings;

    public ComputerGame(String title, String producer, ArrayList<Double> ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings != null ? new ArrayList<>(ratings) : new ArrayList<>();
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

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = new ArrayList<>(ratings);
    }

    public void addRating(double rating) {
        this.ratings.add(rating);
    }

    public void removeRating(double rating) {
        ratings.remove(rating);
    }

    @Override
    public String toString() {
        return String.format("[%s]: [%s], [%s], Ratings: %s.", ComputerGame.class.getSimpleName(), title, producer, ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, ratings);
    }
}
