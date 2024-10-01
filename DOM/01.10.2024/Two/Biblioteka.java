import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;

    public Biblioteka() {
        ksiazki = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
        System.out.println("\nDodano ksiazke: " + ksiazka.getTytul() + " do biblioteki");
    }

    public void usunKsiazke(Ksiazka ksiazka) {
        if (ksiazki.remove(ksiazka)) {
            System.out.println("\nKsiazka: " + ksiazka.getTytul() + " zostala usunieta z biblioteki");
        }
    }
    public void wyswietlListe() {
        System.out.println("\nLista wszystkich ksiazek: ");
        for (Ksiazka ksiazka : ksiazki) {
            ksiazka.wyswietlInfo();
        }
    }

    public void wyszukajPoTytule(String tytul) {
        boolean znaleziono = false;
        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getTytul().equalsIgnoreCase(tytul)) {
                znaleziono = true;
                System.out.println("\n");
                ksiazka.wyswietlInfo();
                break;
            }
            if (!znaleziono) {
                System.out.println("\nNie znaleziono ksiazki o nazwie: " + ksiazka.getTytul());
            }
        }
    }
}
