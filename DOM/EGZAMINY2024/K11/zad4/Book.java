package zad4;

public class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "title: " + title + ", pages: " + pages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.getPages(), o.getPages());
    }
}
