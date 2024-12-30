package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Spacecraft {
    private String name;
    private String manufacturer;
    private double[] ratings;

    public Spacecraft(String name, String manufacturer, double[] ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        this.ratings = Arrays.copyOf(ratings, ratings.length);
    }

    public void addRating(double rating) {
        ratings = Arrays.copyOf(ratings, ratings.length + 1);
        ratings[ratings.length - 1] = rating;
    }

    public void removeRating(int index) {
        if (index < 0 || index >= ratings.length) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        double[] newRatings = new double[ratings.length - 1];
        for (int i = 0, j = 0; i < ratings.length; i++) {
            if (i != index) {
                newRatings[j++] = ratings[i];
            }
        }
        ratings = newRatings;
    }

    @Override
    public String toString() {
        return String.format("[%s]: [%s], [%s], %s", Spacecraft.class.getSimpleName(), name, manufacturer, Arrays.toString(ratings));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer) && Objects.deepEquals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, Arrays.hashCode(ratings));
    }
}
