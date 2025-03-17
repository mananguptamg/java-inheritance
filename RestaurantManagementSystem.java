// Superclass Person
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface Worker
interface Worker {
    void performDuties(); // Abstract method to be implemented by subclasses
}

// Subclass Chef (Extends Person, Implements Worker)
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Overriding performDuties method
    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepares dishes");
    }
}

// Subclass Waiter (Extends Person, Implements Worker)
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    // Overriding performDuties method
    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Takes orders, serves food.");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Chef chef = new Chef("Raju", 101, "Chinese");
        Waiter waiter = new Waiter("Daman", 202, 5);

        // Displaying details and duties
        System.out.println("Restaurant Staff Details:");
        System.out.println();
        chef.displayDetails();
        chef.performDuties();
        System.out.println();
        waiter.displayDetails();
        waiter.performDuties();
    }
}

//SampleOutput
//Restaurant Staff Details:
//
//Name: Rajug
//ID: 101
//Role: Chef
//Specialty: Chinese
//Duties: Prepares dishes
//
//Name: Daman
//ID: 202
//Role: Waiter
//Tables Assigned: 5
//Duties: Takes orders, serves food.