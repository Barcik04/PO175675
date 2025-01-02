package zad1;

public class TestStudentRecord {
    public static void main(String[] args) {
        try {
            StudentRecord st1 = new StudentRecord("Igor", "1", 9.2);
            st1.printDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        StudentRecord st2 = new StudentRecord("Gloer", "2", 2.3);
        StudentRecord st3 = new StudentRecord("Ivan", "3", 4.0);

        System.out.println(st2.isHonorStudent());
        System.out.println(st3.isHonorStudent());
        System.out.println("\n");

        st2.printDetails();
        System.out.println("\n");
        st3.printDetails();
    }
}
