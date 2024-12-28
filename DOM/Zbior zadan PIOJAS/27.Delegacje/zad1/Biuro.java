package zad1;

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }


    public void drukujDokument(String tekst) {
        printer.drukuj(tekst);
    }

    public static void main(String[] args) {
        Printer printer = new StandardowyPrinter();

        Biuro b = new Biuro(printer);

        b.drukujDokument("obob dokument");
    }
}
