import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = createList(10);
        System.out.println(list);
        ArrayList<Integer> reverse = reverseList(list);
        System.out.println(reverse);
        ArrayList<Integer> reverse1 = reverseWithCode(list);
        System.out.println(reverse1);
    }

    public static ArrayList<Integer> createList (int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        return list;
    }

    public static ArrayList<Integer> reverseList (ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }

    public static ArrayList<Integer> reverseWithCode (ArrayList<Integer> list) {
        Collections.reverse(list);

        return list;
    }
}
