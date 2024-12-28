package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Olsztyn", 20.0);
        Hospital h2 = new Hospital(null, 80.0);
        Hospital h3 = new Hospital("", -2.2);

        Clinic c1 = new Clinic("Olsztyn", 20.0, 7.1);
        Clinic c2 = new Clinic("", 20.0, 5.0);
        Clinic c3 = new Clinic("Olsztyn", -20.0, 7.1);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n\n");

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(c1));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(h1.equals(h1));
    }
}
