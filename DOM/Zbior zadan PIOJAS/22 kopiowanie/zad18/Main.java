package zad18;

public class Main {
    public static void main (String[] args) {
        HeadNurse hn1 = new HeadNurse("Jola", 102, 19930.0, 1100.0);

        try {
            HeadNurse hn2 = (HeadNurse) hn1.clone();

            hn1.setBonus(552.0);

            System.out.println(hn1);
            System.out.println(hn2);
        } catch (CloneNotSupportedException e) {
            System.out.println("nah");
        }
    }
}
