package zad17;

public interface VATCalculator {
    double vatRate = 0.23;

    static double calculateVAT(double price) {
        return price * vatRate;
    }
}
