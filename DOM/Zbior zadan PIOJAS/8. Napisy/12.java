public class Main {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("ignore erongi 123");
        System.out.println(reverseString(word));
    }

    public static StringBuilder reverseString(StringBuilder str) {
        return new StringBuilder(str).reverse();
    }
}
