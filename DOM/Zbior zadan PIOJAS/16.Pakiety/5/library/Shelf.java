package library;

import books.Book;
import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books;

    public Shelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

//    @Override
//    public String toString() {
//        return books.toString();
//    }
}
