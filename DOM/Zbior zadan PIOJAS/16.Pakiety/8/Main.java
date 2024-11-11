import computers.Desktop;
import computers.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", "i5", 780);
        System.out.println(laptop);

        Desktop desktop = new Desktop("Lenovo", "i7", "#B45");
        System.out.println(desktop);

        Desktop desktop2 = new Desktop("Lenovo", "i8", "#B45");
        System.out.println(desktop2);
    }
}

