package zad2;

public class Teacher implements Cloneable {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name: " + name + ", subject: " + subject + ", experience: " + experience;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("John", "Math", 1);

        try {
            Teacher t2 = (Teacher) t1.clone();
            t1.setExperience(10);
            System.out.println(t1);
            System.out.println(t2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Nie mozna sklonowac");
        }
    }
}
