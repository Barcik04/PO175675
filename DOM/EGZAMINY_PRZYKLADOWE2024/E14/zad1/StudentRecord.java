package zad1;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA out of range");
        }
    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public void printDetails() {
        System.out.println("Name: " + name + " ID: " + id + " GPA: " + gpa);
    }
}
