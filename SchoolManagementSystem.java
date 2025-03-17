// Superclass Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to be overridden in subclasses
    public void displayRole() {
        System.out.println("General Person");
    }
}

// Subclass Teacher (Extends Person)
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole method
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

// Subclass Student (Extends Person)
class Student extends Person {
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole method
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass Staff (Extends Person)
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayRole method
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different school roles
        Teacher teacher = new Teacher("Mrs. Rashmi", 35, "Mathematics");
        Student student = new Student("Amit", 16, 10);
        Staff staff = new Staff("Ajay", 40, "Accounts");

        // Displaying role details
        System.out.println("School System Roles:");
        System.out.println();
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();
        student.displayDetails();
        student.displayRole();
        System.out.println();
        staff.displayDetails();
        staff.displayRole();
    }
}

//SampleOutput
//School System Roles:
//
//Name: Mrs. Rashmi
//Age: 35
//Role: Teacher
//Teaches: Mathematics
//
//Name: Amit
//Age: 16
//Role: Student
//Grade: 10
//
//Name: Ajay
//Age: 40
//Role: Staff
//Department: Accounts
