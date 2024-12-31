package zad4;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("Igor", "Infrastructure"));

        Collection<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee("Cole", "Managment"));

        Collection<Employee> result = Alg.mergeCollections(employees1, employees2);
        for (Employee employee : result) {
            System.out.println(employee);
        }

        System.out.println(employees1.equals(employees2));
        
    }
}
