public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;
    private int predkosc;

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.predkosc = 0;
    }

    public void przyspiesz(int ile) {
        this.predkosc += ile;
        System.out.println("Samochod jedzie: " + this.predkosc + " km/h");
    }

    public void zwolnij(int ile) {
        this.predkosc -= ile;
        System.out.println("Samochod jedzie: " +this.predkosc + " km/h");
    }

    public void wyswietlInfo() {
        System.out.println("Marka: " + this.marka + "  model: " + this.model + "  rokProdukcji: " + this.rokProdukcji);
    }
}
