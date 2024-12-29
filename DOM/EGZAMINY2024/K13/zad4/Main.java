package zad4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Hobbit", 291));
        books.add(new Book("Lordy", 362));
        books.add(new Book("Rok 1980", 99));

        Iterator<Book> iterator = books.iterator();
        Book result = Alg.findMax(iterator);
        System.out.println(result);
    }
}
