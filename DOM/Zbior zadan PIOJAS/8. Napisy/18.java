public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("jola lojalna jola nielojalna");
        String str1 = "jola";
        String str2 = "karolina";
        replaceSubString(sb, str1, str2);
    }

    public static void replaceSubString(StringBuffer sb, String oldSub, String newSub) {
        int index = sb.indexOf(oldSub);

        while (index != -1) {
            sb.replace(index, index + oldSub.length(), newSub);
            index = sb.indexOf(oldSub, index + newSub.length());
        }
        System.out.println(sb);
    }
}
