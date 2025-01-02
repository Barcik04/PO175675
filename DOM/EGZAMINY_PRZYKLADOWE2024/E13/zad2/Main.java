package zad2;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów ImmutablePoint
        ImmutablePoint point1 = new ImmutablePoint(1, 2, 3);
        ImmutablePoint point2 = new ImmutablePoint(1, 2, 3);
        ImmutablePoint point3 = new ImmutablePoint(4, 5, 6);

        // Wyświetlanie obiektów
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 3: " + point3);

        // Porównywanie obiektów
        System.out.println("Point 1 equals Point 2: " + point1.equals(point2));
        System.out.println("Point 1 equals Point 3: " + point1.equals(point3));

        // HashCode
        System.out.println("HashCode of Point 1: " + point1.hashCode());
        System.out.println("HashCode of Point 2: " + point2.hashCode());
        System.out.println("HashCode of Point 3: " + point3.hashCode());
    }
}

