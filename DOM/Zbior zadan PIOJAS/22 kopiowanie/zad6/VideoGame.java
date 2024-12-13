package zad6;

import java.util.Calendar;
import java.util.Date;

public class VideoGame implements Cloneable {
    private String title;
    private String genre;
    private Date releaseDate;

    public VideoGame(String title, String genre, Date releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        VideoGame videoGame = (VideoGame) super.clone();
        videoGame.releaseDate = new Date(releaseDate.getTime());
        return videoGame;
    }

    @Override
    public String toString() {
        return "title: " + title + ", genre: " + genre + ", releaseDate: " + releaseDate;
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.JUNE, 19);
        Date originalDate = calendar.getTime();

        VideoGame vg1 = new VideoGame("Hobbit", "Adventure", originalDate);

        try {
            VideoGame vg2 = (VideoGame) vg1.clone();
            calendar.set(2016, Calendar.JUNE, 19);
            vg1.setReleaseDate(calendar.getTime());

            System.out.println("vg1: " + vg1);
            System.out.println("vg2: " + vg2);
        } catch (CloneNotSupportedException e) {
            System.out.println("not cloneable");
        }
    }
}

