package zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckTwoIntegers {
    public static void division() {
        Scanner input = new Scanner(System.in);
        boolean isCorrect = false;

        while (!isCorrect) {
            try {
                System.out.println("Put first number: ");
                int inputA = input.nextInt();
                System.out.println("Put second number: ");
                int inputB = input.nextInt();

                double result = (double) inputA / inputB;
                System.out.println(result);
                isCorrect = true;
            } catch (ArithmeticException e) {
                System.out.println("Zero division. Try again.");
            } catch (InputMismatchException e) {
                System.out.println("Your input is not a number");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        division();
    }
}
