import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put in a size of your list: ");
        int size = scanner.nextInt();

        generateList(size);
    }

    public static double generateRandom(int min, int max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static void generateList(int size) {
        double[] numbers = new double[size];

        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generateRandom(1, 30);
            sum += numbers[i];
            System.out.printf("\t%.2f ", numbers[i]);
        }
        double avg = sum / numbers.length;
        System.out.println("\n\n" + avg);
    }
}
