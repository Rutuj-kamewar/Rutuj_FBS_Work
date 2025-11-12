package Robotics;

// Superclass
class Robot {
    int robotId;
    String model;
    double batteryLevel; // in percentage

    // Default constructor
    Robot() {
        this.robotId = 0;
        this.model = "Unknown";
        this.batteryLevel = 100.0;
    }

    // Parameterized constructor
    Robot(int robotId, String model, double batteryLevel) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // Setters
    void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Getters
    int getRobotId() {
        return this.robotId;
    }

    String getModel() {
        return this.model;
    }

    double getBatteryLevel() {
        return this.batteryLevel;
    }

    // Method to recharges
    void chargeBattery() {
        this.batteryLevel = 100.0;
        System.out.println(model + " is now fully charged!");
    }

    // Display robot details
    void display() {
        System.out.println("Robot ID: " + robotId);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("--------------------------------------");
    }

    // Task 
    void performTask() {
        System.out.println(model + " is performing a generic task...");
    }
}

// Subclass 1 - IndustrialRobot
class IndustrialRobot extends Robot {
    String taskType;
    double loadCapacity;

    // Default constructor
    IndustrialRobot() {
        super();
        this.taskType = "Assembly";
        this.loadCapacity = 50.0;
    }

    // Parameterized constructor
    IndustrialRobot(int robotId, String model, double batteryLevel, String taskType, double loadCapacity) {
        super(robotId, model, batteryLevel);
        this.taskType = taskType;
        this.loadCapacity = loadCapacity;
    }

    // Setters
    void setIndustrialRobot(int robotId, String model, double batteryLevel, String taskType, double loadCapacity) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.taskType = taskType;
        this.loadCapacity = loadCapacity;
    }

    // Getters
    String getTaskType() {
        return this.taskType;
    }

    double getLoadCapacity() {
        return this.loadCapacity;
    }

    // Override performTask
    void performTask() {
        System.out.println(model + " is performing " + taskType + " with a load capacity of " + loadCapacity + " kg.");
    }

    // Display details
    void display() {
        System.out.println("Robot Type: Industrial Robot");
        System.out.println("Robot ID: " + robotId);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Task Type: " + taskType);
        System.out.println("Load Capacity: " + loadCapacity + " kg");
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - ServiceRobot
class ServiceRobot extends Robot {
    String areaOfService;
    String aiVersion;

    // Default constructor
    ServiceRobot() {
        super();
        this.areaOfService = "Hospital Assistance";
        this.aiVersion = "v1.0";
    }

    // Parameterized constructor
    ServiceRobot(int robotId, String model, double batteryLevel, String areaOfService, String aiVersion) {
        super(robotId, model, batteryLevel);
        this.areaOfService = areaOfService;
        this.aiVersion = aiVersion;
    }

    // Setters
    void setServiceRobot(int robotId, String model, double batteryLevel, String areaOfService, String aiVersion) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.areaOfService = areaOfService;
        this.aiVersion = aiVersion;
    }

    // Getters
    String getAreaOfService() {
        return this.areaOfService;
    }

    String getAiVersion() {
        return this.aiVersion;
    }

    // Override performTask
    void performTask() {
        System.out.println(model + " is assisting in " + areaOfService + " using AI version " + aiVersion + ".");
    }

    // Display details
    void display() {
        System.out.println("Robot Type: Service Robot");
        System.out.println("Robot ID: " + robotId);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Area of Service: " + areaOfService);
        System.out.println("AI Version: " + aiVersion);
        System.out.println("--------------------------------------");
    }
}

// Test class with main()
class TestRobot {
    public static void main(String[] args) {

        // Create an IndustrialRobot object
        IndustrialRobot r1 = new IndustrialRobot(101, "Tata-Brabo-X", 85.5, "Material Handling", 120.0);

        ServiceRobot r2 = new ServiceRobot(202, "DeltaV-Helper", 92.0, "Medical Assistance", "v2.3");

        // Display both
        r1.display();
        r1.performTask();

        r2.display();
        r2.performTask();
    }
}
