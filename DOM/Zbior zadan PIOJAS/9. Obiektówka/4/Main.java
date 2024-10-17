public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        double dist12 = p1.distance(p2);
        System.out.println(dist12);
    }
}