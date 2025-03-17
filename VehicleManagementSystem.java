// Superclass Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel(); // Abstract method to be implemented by PetrolVehicle
}

// Subclass ElectricVehicle (Extends Vehicle)
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle (Extends Vehicle, Implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Overriding refuel method
    @Override
    public void refuel() {
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle nexon = new ElectricVehicle("Nexon", 120, 100);
        PetrolVehicle alto = new PetrolVehicle("Alto", 110, 60);

        // Displaying details and specific actions
        System.out.println("Vehicle Management System:");
        System.out.println();
        nexon.displayDetails();
        nexon.charge();
        System.out.println();
        alto.displayDetails();
        alto.refuel();
    }
}

//SampleOutput
//Vehicle Management System:
//
//Model: Nexon
//Max Speed: 120 km/h
//Battery Capacity: 100 kWh
//
//Model: Alto
//Max Speed: 110 km/h
//Fuel Capacity: 60 liters
