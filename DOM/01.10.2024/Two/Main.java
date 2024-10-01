public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();

        Ksiazka ksiazka1 = new Ksiazka("Hobbit", "Tolkien", 1999, true);
        Ksiazka ksiazka2 = new Ksiazka("Chlopi", "Zbigniew Ban", 1971, false);
        Ksiazka ksiazka3 = new Ksiazka("Puchatek", "Jan Sebastian Bach", 1981, false);


        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);
        biblioteka.wyswietlListe();

        biblioteka.usunKsiazke(ksiazka2);

        biblioteka.wyswietlListe();

        biblioteka.wyszukajPoTytule("Hobbit");
    }
}