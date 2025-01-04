package zad1;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Olsztyn", -20.0);

        try {
            Hospital h2 = h1.clone();

            h1.setName("Jodgan");
            System.out.println(h1);
            System.out.println(h2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
