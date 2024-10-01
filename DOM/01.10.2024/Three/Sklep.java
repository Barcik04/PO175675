import java.util.ArrayList;

public class Sklep {
    private ArrayList<Produkt> produkty;

    public Sklep(){
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        System.out.println("\nDodano produkt: " + produkt.getNazwa());
    }

    public void usunProdukt(Produkt produkt) {
        produkty.remove(produkt);
        System.out.println("\nUsunieto produkt: " + produkt.getNazwa());
    }

    public void wyswietlProdukty() {
        System.out.println("\n");
        for (Produkt produkt : produkty) {
            produkt.wyswietlInfo();
        }
    }

    public void wyszukajProdukt(String nazwa) {
        boolean dostepnosc = false;
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase(nazwa)) {
                dostepnosc = true;
                System.out.println("\nZnaleziono!");
                produkt.wyswietlInfo();
            }
        }
        if (!dostepnosc) {
            System.out.println("\nNie posiadamy takiego produktu jak " + nazwa);
        }
    }

    public void zakupProduktu(String nazwa, int ile) {
        boolean dostepnosc = false;
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase(nazwa)) {
                dostepnosc = true;
                produkt.kup(ile);
                break;
            }
        }
        if (!dostepnosc) {
            System.out.println("Nie znalezlismy produktu o nazwie " + nazwa);
        }
    }
}
