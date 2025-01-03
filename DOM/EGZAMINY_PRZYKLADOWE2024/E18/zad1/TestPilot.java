package zad1;

public class TestPilot {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};
        Pilot p1 = new Pilot("Igor", arr);

        try {
            Pilot p2 = p1.clone();

            arr[2] = 0;
            p1.setFlightHours(arr);
            System.out.println(p1);
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }
    }
}
