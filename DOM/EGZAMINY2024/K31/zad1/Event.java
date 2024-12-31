package zad1;

import java.util.Objects;

public class Event {
    private String title;
    private String date;
    private Vunue vunue;
    private int attendeeCount;

    public Event(String title, String date, Vunue vunue, int attendeeCount) {
        this.title = title != null ? title : "";
        this.date = date != null ? date : "";
        this.vunue = vunue != null ? vunue : new Vunue("", "", 0, 0);
        this.attendeeCount = attendeeCount > 0 ? attendeeCount : 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title != null ? title : "";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date != null ? date : "";
    }

    public Vunue getVunue() {
        return vunue;
    }

    public void setVunue(Vunue vunue) {
        this.vunue = vunue != null ? vunue : new Vunue("", "", 0, 0);
    }

    public int getAttendeeCount() {
        return attendeeCount;
    }

    public void setAttendeeCount(int attendeeCount) {
        this.attendeeCount = attendeeCount > 0 ? attendeeCount : 0;
    }

    @Override
    public String toString() {
        return "title: " + title + ", date: " + date + ", vunue: " + vunue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return attendeeCount == event.attendeeCount && Objects.equals(title, event.title) && Objects.equals(date, event.date) && Objects.equals(vunue, event.vunue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, vunue, attendeeCount);
    }
}
