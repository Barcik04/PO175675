public class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;

    public Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public void kup(int ile) {
        if (this.ilosc >= ile) {
            this.ilosc -= ile;
            System.out.println("Zakupiono " + ile + " " + this.nazwa);
        } else {
            System.out.println("Nie ma tyle towaru, maksymalna dostepna ilosc to: " + this.ilosc);
        }
    }

    public void dostawa(int ile) {
        if (ile > 0) {
            this.ilosc += ile;
        } else {
            System.out.println("Nie mozna dostarczyc ujemnej liczby produktu!");
        }
    }

    public void wyswietlInfo() {
        System.out.println("Informacje o: " + this.nazwa + " | cena: " + this.cena + " | ilosc: " + this.ilosc);
    }

    public String getNazwa() {
        return nazwa;
    }
}
