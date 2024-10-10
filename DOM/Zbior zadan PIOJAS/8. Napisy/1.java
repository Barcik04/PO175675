public class Main {
    public static void main(String[] args) {
        String word = "roleX";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String reversedWord = new String(chars);
        System.out.println(reversedWord);
    }
}
