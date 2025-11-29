package Throws;

import Throw.Age;
import Throw.InvalidAgeException;

public class Student {
    int marks;
    String name;
    int rollNumber;

    public Student(int marks, String name, int rollNumber) {
        this.marks = marks;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void calculateGrade(int marks) throws InvalidMarksException {

        if (marks < 0) {
            throw new InvalidMarksException();
        }
        else if(marks<35) {
        	System.out.println("Fail");
        }
        else if (marks < 49) {
            System.out.println("Pass");
        }
        else if (marks < 59) {
            System.out.println("Second Class");
        }
        else if (marks < 74) {
            System.out.println("First Class");
        }
        else {
            System.out.println("Distinction");
        }
    }
}

class Test {

    public static void main(String[] args) {
        Student a = new Student(17, "rutuj", 50);

        try {
            a.calculateGrade(-1);
        }
        catch (InvalidMarksException ime) {
            System.out.println(ime);
        }
    }
}
