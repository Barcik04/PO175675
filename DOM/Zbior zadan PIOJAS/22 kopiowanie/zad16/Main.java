package zad16;

public class Main {
    public static void main(String[] args) {
        HeadTeacher hd1 = new HeadTeacher("Igor", 20, 4900.10, 200.0);

        try {
            HeadTeacher hd2 = (HeadTeacher) hd1.clone();

            hd1.setBonus(250.0);

            System.out.println(hd1);
            System.out.println(hd2);
        } catch (CloneNotSupportedException e) {
            System.out.println("jojo jaja");
        }
    }
}
