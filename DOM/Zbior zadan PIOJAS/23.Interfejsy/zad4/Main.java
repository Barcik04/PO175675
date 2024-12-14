package zad4;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println(converter.convertToEUR(6620));
        System.out.println(converter.convertToPLN(2190));
        System.out.println(converter.getConversionRate("EUR"));
    }
}
