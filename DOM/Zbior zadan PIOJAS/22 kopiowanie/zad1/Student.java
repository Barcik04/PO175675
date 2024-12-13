package zad1;

public class Student implements Cloneable {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", grade: " + grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jack", 23, 0.5);

        try {
            Student s2 = (Student) s1.clone();
            System.out.println(s2);
            s1.setGrade(3);
            System.out.println(s1);
            System.out.println(s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Nie mozna skopiowac");
        }
    }
}
