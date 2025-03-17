import java.util.Scanner;

// Superclass Employee
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary:" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    private int internshipDuration; // Duration in months

    // Constructor
    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Objects of Subclasses
        Employee manager = new Manager("Amit", 101, 100000, 10);
        Employee developer = new Developer("Polly", 256, 200000, "Java");
        Employee intern = new Intern("Millan", 370, 300000, 6);

        // Displaying details
        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}


//SampleOutput
//Employee ID: 101
//        Name: Amit
//        Salary:100000.0
//        Role: Manager
//        Team Size: 10
//
//        Employee ID: 256
//        Name: Polly
//        Salary:200000.0
//        Role: Developer
//        Programming Language: Java
//
//        Employee ID: 370
//        Name: Millan
//        Salary:300000.0
//        Role: Intern
//        Internship Duration: 6 months
