package Arrays;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(103, "Ravi", 50000.0),
            new Employee(101, "Amit", 60000.0),
            new Employee(102, "Kiran", 55000.0)
        };

        Arrays.sort(employees, Comparator.comparing(e -> e.name));

        System.out.println("Employees sorted by name (ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
