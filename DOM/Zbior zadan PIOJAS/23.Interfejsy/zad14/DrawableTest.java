package zad14;

public class DrawableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.display();
        System.out.println("\n\n");
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.display();

        System.out.println("\n\n");
        System.out.println(Drawable.getType());
    }
}
