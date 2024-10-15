public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jarglaczyna");
        StringBuilder[] result = splitByEvenOdd(sb);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static StringBuilder[] splitByEvenOdd(StringBuilder sb) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder(sb);

       for (int i = evenSb.length() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                evenSb.deleteCharAt(i);
            }
       }

       for (int i = 0; i < sb.length(); i++) {
           if (i % 2 != 0) {
               oddSb.append(sb.charAt(i));
           }
       }

       return new StringBuilder[]{oddSb, evenSb};
    }
}
