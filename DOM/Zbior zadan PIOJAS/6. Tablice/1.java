import java.util.Random;

public class Main {
    public static void main(String[] args) {
        createList();
    }

    public static int generateRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void createList() {
        int[] numbers;
        numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {  // Poprawione: i < numbers.length
            numbers[i] = generateRandom(0, 10);
            System.out.print("\t" + numbers[i]);
        }
    }
}
