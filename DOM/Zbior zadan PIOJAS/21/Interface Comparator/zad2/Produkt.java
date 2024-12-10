package zad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;



public class Produkt {

    public static class ComparatorFunc implements Comparator<Produkt> {
        @Override
        public int compare(Produkt p1, Produkt p2) {
            return p1.getDataWaznosci().compareTo(p2.getDataWaznosci());
        }
    }

    private String nazwa;
    private double cena;
    private LocalDate dataWaznosci;

    public Produkt() {
    }

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    @Override
    public String toString() {
        return
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataWaznosci=" + dataWaznosci;
    }

    public static void main(String[] args) {
        ArrayList<Produkt> products = new ArrayList<>();
        products.add(new Produkt("Jabko", 5.99, LocalDate.of(2026, 12, 19)));
        products.add(new Produkt("Gruszka", 5.09, LocalDate.of(2027, 4, 1)));
        products.add(new Produkt("Koniec", 4.22, LocalDate.of(2028, 7, 2)));


        products.sort(new ComparatorFunc());

        for (Produkt p : products) {
            System.out.println(p);
        }
    }
}


