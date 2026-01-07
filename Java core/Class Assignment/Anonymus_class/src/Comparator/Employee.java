package Comparator;

import java.util.*;

public class Employee {
    String name;
    double salary;
    int id;

    Employee() {
        this("Unknown", 0.0, 0);
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "[name=" + name + ", salary=" + salary + ", id=" + id + "]";
    }

    int getId() {
        return id;
    }
}
