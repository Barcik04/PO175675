package zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Hobbit", "Jacek Grzybulak"));
        movies.add(new Movie("Train Your Dragon", "Jacek Grzybulak"));
        movies.add(new Movie("Shrek", "Jacek Grzybulak"));
        movies.add(new Movie("Toy I", "Jacek Grzybulak"));

        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
