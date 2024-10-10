public class Main {
    public static void main(String[] args) {
        String word1 = "Ka   sz a  12 3  ";
        char[] word2 = new char[word1.length()];

        int index = 0;
        for (int i = 0; i <word1.length(); i++) {
            if (word1.charAt(i) != ' ') {
                word2[index] = word1.charAt(i);
                index++;
            }
        }

       String strWithoutSpaces = new String(word2, 0, index);
        System.out.println(strWithoutSpaces);
    }
}
