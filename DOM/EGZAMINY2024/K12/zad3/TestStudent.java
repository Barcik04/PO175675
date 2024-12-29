package zad3;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("Igor", 20);
        Student stu2 = new Student("Mary", 20);
        Student stu3 = new Student("John", 40);
        Student stu4 = new Student("Bary", 20);

        Main.echoIfEquivalent(stu1, stu2, stu3);
        Main.echoIfEquivalent(stu1, stu2, stu4);
    }
}
