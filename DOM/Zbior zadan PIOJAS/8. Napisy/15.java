public class Main {
    public static void main(String[] args) {
        StringBuilder bd = new StringBuilder("Jurek Burek ");
        String str = " to kszka maszka";
        System.out.println(insertSubString(bd, str));
    }

    public static StringBuilder insertSubString(StringBuilder bd, String str){
        int midIndex = bd.length() / 2 - 1;


        return bd.insert(midIndex, str);
    }
}
