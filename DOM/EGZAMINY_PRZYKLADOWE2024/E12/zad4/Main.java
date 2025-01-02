package zad4;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Igor", 4.5f);
        Student st2 = new Student("Mike", 3.2f);
        Student st3 = new Student("Mike", 3.2f);
        Student st4 = new Student("Mike", 3.2f);

        System.out.println(Alg.compareThree(st1, st2, st3));
        System.out.println(Alg.compareThree(st4, st2, st3));
    }
}
