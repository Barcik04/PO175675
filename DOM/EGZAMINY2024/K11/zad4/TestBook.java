package zad4;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Hobbit", 291));
        books.add(new Book("Hobbit", 292));
        books.add(new Book("With Fire and Sword", 153));

        Book result = Main.findMax(books);
        System.out.println(result);
    }
}
