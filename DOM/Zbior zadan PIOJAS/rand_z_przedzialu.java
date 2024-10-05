import java.util.Random;

public class Main {

    // Statyczna metoda do generowania losowej liczby zmiennoprzecinkowej z zakresu 0.0 do 1.0
    public static double generateRandomDouble() {
        Random random = new Random();
        return random.nextDouble();  // Generuje losową liczbę zmiennoprzecinkową z zakresu [0.0, 1.0)
    }

    public static void main(String[] args) {
        // Przykład testu
        double randomDouble = generateRandomDouble();
        System.out.println("Wygenerowana losowa liczba zmiennoprzecinkowa: " + randomDouble);

        // Kolejny test, generowanie liczby zmiennoprzecinkowej z zakresu 0.0 do 10.0
        double randomDoubleInRange = generateRandomDoubleInRange(0.0, 10.0);
        System.out.println("Wygenerowana losowa liczba zmiennoprzecinkowa z zakresu 0.0 - 10.0: " + randomDoubleInRange);
    }

    // Dodatkowa metoda generująca losową liczbę zmiennoprzecinkową z podanego zakresu
    public static double generateRandomDoubleInRange(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();  // Generuje liczbę zmiennoprzecinkową z zakresu [min, max)
    }
}
