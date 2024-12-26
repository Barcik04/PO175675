package D1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <T> boolean isPalindrome(LinkedList<T> list) {

        int j = list.size() - 1;
        int i = 0;

        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 3, 2, 1));


        System.out.println(isPalindrome(list));
    }
}
