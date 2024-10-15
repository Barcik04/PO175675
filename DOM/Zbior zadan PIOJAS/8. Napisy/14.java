public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Konrad lubi margonem");
        System.out.println(mostFrequentChar(str));
    }

    public static char mostFrequentChar(StringBuilder str) {
        int countCharMax = 1;
        int indexMax = 0;

        for (int i = 0; i < str.length(); i++) {
            int countChar = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    countChar++;
                }
            }
            if (countChar > countCharMax) {
                countCharMax = countChar;
                indexMax = i;
            }
        }
        return str.charAt(indexMax);
    }
}
