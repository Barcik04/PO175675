public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Bibilbijbiibla");
        removeDuplicates(str);
    }

    public static void removeDuplicates(StringBuilder str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1){
                result.append(currentChar);
            }
        }

        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }
    }
}
