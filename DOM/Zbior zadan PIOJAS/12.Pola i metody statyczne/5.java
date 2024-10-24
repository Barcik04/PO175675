public class Calculator {
    public static double addition(double a, double b) {
        a += b;
        return a;
    }

    public static double subtraction(double a, double b) {
        a -= b;
        return a;
    }

    public static double multiplication(double a, double b) {
        a *= b;
        return a;
    }

    public static double division(double a, double b) {
        a /= b;
        return a;
    }
}

class TestCalculator {
    public static void main(String[] args) {
        double resultAdd = Calculator.addition(10, 10);
        System.out.println(resultAdd);

        double resultSub = Calculator.subtraction(10, 1);
        System.out.println(resultSub);

        double resultMult = Calculator.multiplication(10, 10);
        System.out.println(resultMult);

        double resultDiv = Calculator.division(123, 10);
        System.out.println(resultDiv);
    }
}
