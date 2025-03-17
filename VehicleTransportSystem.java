// Superclass Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to be overridden
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private int loadCapacity; // in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
    }
}

// Main class
public class VehicleTransportSystem {
    public static void main(String[] args) {
        // Creating an array of Vehicle references holding different objects
        Vehicle[] vehicles = {
                new Car(100, "Petrol", 5),
                new Truck(80, "Diesel", 15),
                new Motorcycle(60, "Petrol")
        };

        // Displaying details using polymorphism
        System.out.println("Vehicle Information:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}


//SampleOutput
//Vehicle Information:
//Max Speed: 100 km/h
//Fuel Type: Petrol
//Vehicle Type: Car
//Seat Capacity: 5
//Max Speed: 80 km/h
//Fuel Type: Diesel
//Vehicle Type: Truck
//Load Capacity: 15 tons
//Max Speed: 60 km/h
//Fuel Type: Petrol
//Vehicle Type: Motorcycle