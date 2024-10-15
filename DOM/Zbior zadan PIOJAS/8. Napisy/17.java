//MOJ WARIANT

//public class Main {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Rowna sie lamu sie");
//        System.out.println(capitalizeEverySecond(sb));
//    }
//
//    public static StringBuffer capitalizeEverySecond(StringBuffer sb) {
//        StringBuffer sb2 = new StringBuffer();
//
//        for (int i = 0; i < sb.length(); i++) {
//            if (i % 2 == 0) {
//                sb2.append(sb.toString().toUpperCase().charAt(i));
//            } else {
//                sb2.append(sb.charAt(i));
//            }
//
//        }
//
//        return sb2;
//    }
//}




//CORRECT VARIANT

//public class Main {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("jarglaczyna to dziewczyna");
//        capitalizeEverySecond(sb);
//    }
//
//    public static void capitalizeEverySecond(StringBuffer sb) {
//        for (int i = 0; i < sb.length(); i++) {
//            if (i % 2 == 0) {
//                char currentChar = sb.charAt(i);
//                sb.setCharAt(i, Character.toUpperCase(currentChar));
//            }
//        }
//
//        System.out.println(sb);
//    }
//}
