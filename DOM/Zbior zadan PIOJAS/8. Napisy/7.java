public class Main {
    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "hejjlono";
        String word3 = "baklazan";

        System.out.println(isTheSameStartEnd(word1, word2));
        System.out.println(isTheSameStartEnd(word1, word3));
    }

    public static boolean isTheSameStartEnd(String word1, String word2) {
        return (word1.charAt(0) == word2.charAt(0)) && (word1.charAt(word1.length() - 1) == word2.charAt(word2.length() - 1));
    }
}
