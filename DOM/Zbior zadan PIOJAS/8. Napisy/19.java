public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Jablko jedzone 123");
        trimToSize(sb, 15);
        System.out.println(sb);
    }

    public static void trimToSize(StringBuffer sb, int n) {
        if (sb.length() > n) {
            sb.setLength(n);
        }
    }
}
