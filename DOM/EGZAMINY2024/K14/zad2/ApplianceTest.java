package zad2;

public class ApplianceTest {
    public static void main(String[] args) {
        Oven oven = new Oven();

        oven.turnOn("eLektrycznosc");
        oven.turnOn("bobo");

        System.out.println(oven.isReady(180));
        System.out.println(oven.isReady(181));

        oven.turnOff();

        oven.emitSound();
        System.out.println(Appliance.info());
    }
}
