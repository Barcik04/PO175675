package Delegaci2;

public class Main {
    public static void main(String[] args) {
        Samochod sm1 = new Samochod(new BenzynowySilnik());
        sm1.start();
        sm1.stop();

        Samochod sm2 = new Samochod(new SilnikElektryczny());
        sm2.start();
        sm2.stop();
    }
}
