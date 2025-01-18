package Delegaci2;

public class SilnikElektryczny implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("Uruchom");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymaj");
    }
}
