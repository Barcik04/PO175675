package zad2;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute br1 = new BusRoute("1", "Olsztyn", "Warsaw");
        BusRoute br2 = new BusRoute("12345", "Olsztyn", "Gdansk");

        br1.printDetails();
        br2.printDetails();

        System.out.println(br1.isLongRoute());
        System.out.println(br2.isLongRoute());
    }
}
