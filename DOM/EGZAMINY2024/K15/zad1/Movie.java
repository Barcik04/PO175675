package zad1;

public class Movie implements Comparable<Movie>{
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "title: " + title + ", director: " + director;
    }

    @Override
    public int compareTo(Movie o) {
        int result = Integer.compare(o.title.length(), this.title.length());
        if (result == 0) {
            return this.title.compareTo(o.title);
        }
        return result;
    }
}
