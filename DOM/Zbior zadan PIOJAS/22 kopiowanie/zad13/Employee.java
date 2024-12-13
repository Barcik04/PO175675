package zad13;

import java.util.ArrayList;

public class Employee implements Cloneable{
    private String name;
    private ArrayList<Integer> monthlyHours;

    public Employee(String name, ArrayList<Integer> monthlyHours) {
        this.name = name;
        this.monthlyHours = monthlyHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(ArrayList<Integer> monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.monthlyHours = new ArrayList<>(this.monthlyHours);
        return employee;
    }

    @Override
    public String toString() {
        return "name: " + name + ", monthlyHours: " + monthlyHours;
    }

    public static void main(String[] args) {
        ArrayList<Integer> employees = new ArrayList<>();
        employees.add(129);
        employees.add(132);
        employees.add(141);
        employees.add(150);

        Employee em1 = new Employee("John", employees);

        try {
            Employee em2 = (Employee) em1.clone();

            employees.set(3, 133);
            em2.getMonthlyHours().set(2, 163);

            System.out.println(em1);
            System.out.println(em2);
        } catch (CloneNotSupportedException e) {
            System.out.println("nah");
        }
    }
}
