import java.util.Scanner;

public class SumaCyfr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        String input = scanner.nextLine();

        int suma = 0;

        // Usunięcie ewentualnego znaku minus
        String liczbaBezZnaku = input.replace("-", "");

        // Przejście przez każdą cyfrę i dodanie jej do sumy
        for (int i = 0; i < liczbaBezZnaku.length(); i++) {
            char c = liczbaBezZnaku.charAt(i);
            if (Character.isDigit(c)) {
                int cyfra = Character.getNumericValue(c);
                suma += cyfra;
            } else {
                System.out.println("Wprowadzono niepoprawny znak: " + c);
                return;
            }
        }

        System.out.println("Suma cyfr liczby " + input + " wynosi: " + suma);

        scanner.close();
    }
}
