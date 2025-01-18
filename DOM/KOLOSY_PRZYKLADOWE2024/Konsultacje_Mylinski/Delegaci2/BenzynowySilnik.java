package Delegaci2;

public class BenzynowySilnik implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("Silnik włączony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik zatrzymany");
    }
}
