// Superclass Device
class Device {
    protected String deviceId;
    protected String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat (Extending Device)
class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Device Type: Thermostat");
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating a Thermostat object
        Thermostat smartThermostat = new Thermostat("101", "Online", 22);

        // Displaying device status
        System.out.println("Smart Home Device Information:");
        smartThermostat.displayStatus();
    }
}

//SampleOutput
//Smart Home Device Information:
//Device ID: 101
//Status: Online
//Device Type: Thermostat
//Temperature Setting: 22°C