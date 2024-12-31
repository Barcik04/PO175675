package zad1;

public class TestEvent {
    public static void main(String[] args) {
        Vunue v1 = new Vunue("Igor", "Olsztyn", -10, 12);
        Event e1 = new Event(null, "2024", v1, -1);
        Event e2 = new Event("Igor", "2024", v1, -1);

        System.out.println(v1);
        System.out.println(e1);

        System.out.println("\n");

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
    }
}
