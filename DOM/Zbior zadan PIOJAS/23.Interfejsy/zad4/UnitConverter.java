package zad4;

public class UnitConverter implements Converter{
    @Override
    public double convertToPLN(double amount) {
        return amount * 0.90;
    }

    @Override
    public double convertToEUR(double amount) {
        return amount * 1.10;
    }

    @Override
    public double getConversionRate(String currency) {
        return 1.0;
    }
}
