public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();

        Produkt produkt1 = new Produkt("Cytryna", 3, 22);
        Produkt produkt2 = new Produkt("Kiwi", 4, 6);
        Produkt produkt3 = new Produkt("Banan", 3, 19);

        produkt2.wyswietlInfo();

        produkt2.dostawa(15);
        produkt2.wyswietlInfo();

        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        sklep.dodajProdukt(produkt3);

        sklep.wyswietlProdukty();
        sklep.wyszukajProdukt("Cytryna");
        sklep.zakupProduktu("Cytryna", 7);

        sklep.wyswietlProdukty();
    }
}