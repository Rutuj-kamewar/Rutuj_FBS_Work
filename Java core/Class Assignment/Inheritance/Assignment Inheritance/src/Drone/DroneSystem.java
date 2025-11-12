package Drone;

// Superclass
class Drone {
    String droneId;
    String model;
    double batteryLevel; // percentage
    String currentLocation;
    boolean isActive;

    // Default constructor
    Drone() {
        this.droneId = "DR-000";
        this.model = "Unknown";
        this.batteryLevel = 100.0;
        this.currentLocation = "Base Station";
        this.isActive = false;
    }

    // Parameterized constructor
    Drone(String droneId, String model, double batteryLevel, String currentLocation, boolean isActive) {
        this.droneId = droneId;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.currentLocation = currentLocation;
        this.isActive = isActive;
    }

    void recharge() {
        batteryLevel = 100.0;
        System.out.println(model + " (" + droneId + ") has been fully charged!");
    }

    void display() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Location: " + currentLocation);
        System.out.println("Active: " + isActive);
        System.out.println("--------------------------------------");
    }
}

// Subclass 1 - Delivery Drone
class DeliveryDrone extends Drone {
    double payloadWeight;
    String destination;
    boolean hasDelivered;

    // Constructor
    DeliveryDrone(String droneId, String model, double batteryLevel, String currentLocation, boolean isActive,
                  double payloadWeight, String destination, boolean hasDelivered) {
        super(droneId, model, batteryLevel, currentLocation, isActive);
        this.payloadWeight = payloadWeight;
        this.destination = destination;
        this.hasDelivered = hasDelivered;
    }

    // Display details
    void display() {
        System.out.println("Drone Type: Delivery Drone");
        super.display();
        System.out.println("Payload Weight: " + payloadWeight + " kg");
        System.out.println("Destination: " + destination);
        System.out.println("Delivered: " + hasDelivered);
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - Surveillance Drone
class SurveillanceDrone extends Drone {
    double cameraResolution; 
    double flightDuration;
    boolean isRecording;

    // Constructor
    SurveillanceDrone(String droneId, String model, double batteryLevel, String currentLocation, boolean isActive,
                      double cameraResolution, double flightDuration, boolean isRecording) {
        super(droneId, model, batteryLevel, currentLocation, isActive);
        this.cameraResolution = cameraResolution;
        this.flightDuration = flightDuration;
        this.isRecording = isRecording;
    }
    
    // Display details
    void display() {
        System.out.println("Drone Type: Surveillance Drone");
        super.display();
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
        System.out.println("Flight Duration: " + flightDuration + " hours");
        System.out.println("Recording: " + isRecording);
        System.out.println("--------------------------------------");
    }
}

// Test class
class TestDrone {
    public static void main(String[] args) {

        DeliveryDrone d1 = new DeliveryDrone("DR-201", "SkyDrop-X", 85.5, "Warehouse A", false,
                5.0, "Sector 9B", false);

        SurveillanceDrone s1 = new SurveillanceDrone("DR-307", "EagleEye-9", 70.0, "Base South", false,
                48.0, 2.5, false);

        // Display and activate
        d1.display();
        s1.display();

        // Recharge drones
        d1.recharge();
        s1.recharge();
    }
}
