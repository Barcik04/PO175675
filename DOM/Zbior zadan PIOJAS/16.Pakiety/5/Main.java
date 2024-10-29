import books.Book;
import library.Shelf;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hobbit", "Jarmulka", 1298);
        Book book2 = new Book("Kolkata", "Jarmulka", 1328);

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.printBooks();
    }
}