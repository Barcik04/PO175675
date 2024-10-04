import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal field = BigDecimal.ONE;

        for (int i = 0; i < 2; i++) {
            System.out.println("Put in a side length of a rectangle: ");
            BigDecimal numb = scanner.nextBigDecimal();
            field = field.multiply(numb);
        }

        System.out.println(field);
    }
}
