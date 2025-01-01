package zad1;

public class TestHospital {
    public static void main(String[] args) {
        Clinic c1 = new Clinic("Igor", 99.9, 3.2);
        Clinic c2 = new Clinic(null, -1, -0.2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
    }
}
