package zad16;

public class Book implements Comparable<Book>{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author;
    }

    public static void main(String[] args) {
        Integer[] arr = {9, 0, 1, -1, 2, 3, 4, 2, 11, 2};

        System.out.println(Main.sortAndReturnFirst(arr));

        for (Integer i : arr) {
            System.out.print(i + " ");
        }


        Book[] books = {
                new Book("Harry Potter", "J.K. Rowling"),
                new Book("The Hobbit", "J.R.R. Tolkien"),
                new Book("1984", "George Orwell")
        };

        System.out.println(Main.sortAndReturnFirst(books));

        for (Book b : books) {
            System.out.println(b);
        }
    }
}
