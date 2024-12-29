package zad2;

public class TestKitchen {
    public static void main(String[] args) {
        Stove stove = new Stove(4, "Tamagotchi", 1234);
        Kitchen kitchen = new Kitchen("Black", stove);

        try {
            Kitchen kitchenCloned = kitchen.clone();
            System.out.println(kitchenCloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cant copy");
        }
    }
}
