package zad10;

import java.util.Arrays;

public class Employee implements Cloneable {
    private String name;
    private double[] salary = new double[4];

    public Employee(String name, double[] salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.salary = this.salary.clone();
        return employee;
    }

    @Override
    public String toString() {
        return "name: " + name + "salary:\n " + Arrays.toString(salary);
    }

    public static void main(String[] args) {
        double[] salary = new double[4];
        salary[0] = 3900;
        salary[1] = 5000;
        salary[2] = 6000;
        salary[3] = 8000;

        Employee em1 = new Employee("John", salary);

        try {
            Employee em2 = (Employee) em1.clone();
            salary[3] = 12000;
            em2.getSalary()[2] = 4900;

            System.out.println(em1);
            System.out.println(em2);
        } catch (CloneNotSupportedException e) {
            System.out.println("nah");
        }
    }
}
