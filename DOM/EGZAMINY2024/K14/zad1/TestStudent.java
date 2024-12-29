package zad1;

public class TestStudent {
    public static void main(String[] args) {
        int[] grades = {1, 2, 2, 3, 1};

        Student st1 = new Student("Igor", grades);

        try {
            Student stCloned = st1.clone();

            System.out.println(st1);
            System.out.println(stCloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }

        int[] modifiedGrades = st1.getGrades();
        modifiedGrades[0] = 51;
        st1.setGrades(modifiedGrades);

        System.out.println(st1);
    }
}
