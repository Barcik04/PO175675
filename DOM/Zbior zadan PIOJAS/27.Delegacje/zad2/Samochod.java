package zad2;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start() {
        silnik.uruchom();
    }

    public void stop() {
        silnik.zatrzymaj();
    }

    public static void main(String[] args) {
        Silnik silnik = new BenzynowySilnik();

        Samochod samochod = new Samochod(silnik);

        samochod.start();
        samochod.stop();
    }
}
