package zad2;

public class BenzynowySilnik implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("Uruchomiono benzynowy silnik");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano benzynowy silnik");
    }
}
