import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(50, 100));
        }

        System.out.println(sortArray(list));
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }
}
