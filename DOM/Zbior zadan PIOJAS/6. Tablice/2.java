import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GenerateList();
    }

    public static int GenerateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void GenerateList() {
        int[] numbers;
        numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = GenerateRandom(1, 100);
            System.out.print(numbers[i] + "\t");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("\nAVG is: " + avg);
    }
}
