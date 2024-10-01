public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int rokWydania, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.dostepna = dostepna;
    }

    public void wypozycz() {
        if (this.dostepna) {
            this.dostepna = false;
            System.out.println("Ksiazka: " + this.tytul + " zostala wypozyczona");
        } else {
            System.out.println("Ksiazka: " + this.tytul + " jest niedostepna");
        }
    }

    public void zwroc() {
        if (this.dostepna) {
            System.out.println("Ksiazka: " + this.tytul + " nie jest wypozyczona");
        } else {
            this.dostepna = true;
            System.out.println("Ksiazka: " + this.tytul + " zostala zwrocona");
        }
    }

    public void wyswietlInfo() {
        System.out.println("Autor: " + this.autor + "  rok wydania: " + this.rokWydania + "  czy dostepna: " + this.dostepna);
    }

    public String getTytul() {
        return tytul;
    }
}
