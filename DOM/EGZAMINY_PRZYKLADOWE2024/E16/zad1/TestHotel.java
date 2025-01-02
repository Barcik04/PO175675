package zad1;

public class TestHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Abakus", 52.2);
        Hotel h2 = new Hotel("Bakus", -1.2);

        try {
            Hotel clonedHotel1 = h1.clone();
            Hotel clonedHotel2 = h2.clone();

            System.out.println(clonedHotel1);
            System.out.println(clonedHotel2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
