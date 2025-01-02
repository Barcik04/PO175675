package zad4;

public class Main {
    public static void main(String[] args) {
        ItemManager m1 = new ItemManager(new Integer[]{1, 2, 3, 4, 5});
        m1.addItem(10);
        m1.getItem(2);
        System.out.println(m1.getItemCount());

        m1.addItem(20);
        System.out.println(m1);
        System.out.println(m1.getItemCount());
    }
}
