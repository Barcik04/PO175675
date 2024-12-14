package zad4;

public class CurrencyConverter implements Converter{
    @Override
    public double convertToPLN(double amount) {
        return amount * 4.26;
    }

    @Override
    public double convertToEUR(double amount) {
        return amount / 4.26;
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency.equals("EUR")) {
            return 4.26;
        } else {
            return 0.23;
        }
    }
}
