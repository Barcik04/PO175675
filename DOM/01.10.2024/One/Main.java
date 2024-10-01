public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Toyota", "Crolla", 2016);

        samochod.wyswietlInfo();

        samochod.przyspiesz(50);
        samochod.zwolnij(20);

        samochod.wyswietlInfo();
    }
}