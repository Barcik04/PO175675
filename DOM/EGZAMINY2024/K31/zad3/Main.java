package zad3;

public class Main {
    public static <T> void announceIfUnique(T a, T b, T c) {
        if (!(a.equals(b) || a.equals(c) || b.equals(c))) {
            System.out.println("wszytskie sa unikalne");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Bobbit", "Tolkien");
        Book b2 = new Book("Hobbit", "Tolkien");
        Book b3 = new Book("Lord of the Rings", "Tolkien");

        announceIfUnique(b1, b2, b3);
    }
}
