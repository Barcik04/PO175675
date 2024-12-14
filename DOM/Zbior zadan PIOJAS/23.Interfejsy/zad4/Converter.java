package zad4;

public interface Converter {
    double convertToPLN(double amount);
    double convertToEUR(double amount);
    double getConversionRate(String currency);
}
