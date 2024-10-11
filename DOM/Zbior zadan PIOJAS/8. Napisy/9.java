import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputLevels = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        System.out.println("Enter the number of levels in a conifer: ");
        int levels = inputLevels.nextInt();

        System.out.println("Enter a char from which will the conifer be build from: ");
        char character = inputChar.next().charAt(0);

        buildConifer(levels, character);
    }

    public static void buildConifer(int levels, char a) {
        StringBuilder conifer = new StringBuilder();

        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < levels - i - 1; j++) {
                conifer.append(' ');
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                conifer.append(a);
            }
            conifer.append('\n');
        }

        System.out.println(conifer);
    }
}
