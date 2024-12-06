package zad2;


import java.time.LocalDate;
import java.util.Arrays;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary + ", EmploymentDate: " + employmentDate;
    }


    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Raman", 3400.99, LocalDate.now()),
            new Employee("Igor", 2109.09, LocalDate.of(1999, 12, 21)),
            new Employee("Kacper", 9820.10, LocalDate.now())
        };
        Arrays.sort(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }


}


