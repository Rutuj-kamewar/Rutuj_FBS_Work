package DroneAbstract;

// Superclass
abstract class Drone {
    String droneId;
    String model;
    double batteryLevel; 
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

    // ABSTRACT toString()
    public abstract String toString();
}

// Subclass 1 - Delivery Drone
class DeliveryDrone extends Drone {
    double payloadWeight;
    String destination;
    boolean hasDelivered;

    DeliveryDrone(String droneId, String model, double batteryLevel, String currentLocation, boolean isActive,
                  double payloadWeight, String destination, boolean hasDelivered) {

        super(droneId, model, batteryLevel, currentLocation, isActive);
        this.payloadWeight = payloadWeight;
        this.destination = destination;
        this.hasDelivered = hasDelivered;
    }

    public String toString() {
        return "Drone Type: Delivery Drone" +
               "\nDrone ID: " + droneId +
               "\nModel: " + model +
               "\nBattery Level: " + batteryLevel + "%" +
               "\nLocation: " + currentLocation +
               "\nActive: " + isActive +
               "\nPayload Weight: " + payloadWeight + " kg" +
               "\nDestination: " + destination +
               "\nDelivered: " + hasDelivered;
    }
}

// Subclass 2 - Surveillance Drone
class SurveillanceDrone extends Drone {
    double cameraResolution;
    double flightDuration;
    boolean isRecording;

    SurveillanceDrone(String droneId, String model, double batteryLevel, String currentLocation, boolean isActive,
                      double cameraResolution, double flightDuration, boolean isRecording) {

        super(droneId, model, batteryLevel, currentLocation, isActive);
        this.cameraResolution = cameraResolution;
        this.flightDuration = flightDuration;
        this.isRecording = isRecording;
    }

    public String toString() {
        return "Drone Type: Surveillance Drone" +
               "\nDrone ID: " + droneId +
               "\nModel: " + model +
               "\nBattery Level: " + batteryLevel + "%" +
               "\nLocation: " + currentLocation +
               "\nActive: " + isActive +
               "\nCamera Resolution: " + cameraResolution + " MP" +
               "\nFlight Duration: " + flightDuration + " hours" +
               "\nRecording: " + isRecording;
    }
}

// Test class
class TestDrone {
    public static void main(String[] args) {

        Drone d1 = new DeliveryDrone(
                "DR-201", "SkyDrop-X", 85.5, "Warehouse A", false,
                5.0, "Sector 9B", false
        );

        Drone s1 = new SurveillanceDrone(
                "DR-307", "EagleEye-9", 70.0, "Base South", false,
                48.0, 2.5, false
        );

        System.out.println(d1);
        System.out.println("\n------------------------\n");
        System.out.println(s1);

        d1.recharge();
        s1.recharge();
    }
}
