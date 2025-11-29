package RobotAbstract;

// Superclass
abstract class Robot {
    int robotId;
    String model;
    double batteryLevel;

    Robot() {
        this.robotId = 0;
        this.model = "Unknown";
        this.batteryLevel = 100.0;
    }

    Robot(int robotId, String model, double batteryLevel) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    int getRobotId() {
        return this.robotId;
    }

    String getModel() {
        return this.model;
    }

    double getBatteryLevel() {
        return this.batteryLevel;
    }

    void chargeBattery() {
        this.batteryLevel = 100.0;
        System.out.println(model + " is now fully charged!");
    }

    // ABSTRACT METHODS
    abstract void performTask();
    public abstract String toString();
}

// Subclass 1 - IndustrialRobot
class IndustrialRobot extends Robot {
    String taskType;
    double loadCapacity;

    IndustrialRobot() {
        super();
        this.taskType = "Assembly";
        this.loadCapacity = 50.0;
    }

    IndustrialRobot(int robotId, String model, double batteryLevel, String taskType, double loadCapacity) {
        super(robotId, model, batteryLevel);
        this.taskType = taskType;
        this.loadCapacity = loadCapacity;
    }

    void setIndustrialRobot(int robotId, String model, double batteryLevel, String taskType, double loadCapacity) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.taskType = taskType;
        this.loadCapacity = loadCapacity;
    }

    String getTaskType() {
        return this.taskType;
    }

    double getLoadCapacity() {
        return this.loadCapacity;
    }

    void performTask() {
        System.out.println(model + " is performing " + taskType +
                           " with a load capacity of " + loadCapacity + " kg.");
    }

    public String toString() {
        return "Robot Type: Industrial Robot" +
               "\nRobot ID: " + robotId +
               "\nModel: " + model +
               "\nBattery Level: " + batteryLevel + "%" +
               "\nTask Type: " + taskType +
               "\nLoad Capacity: " + loadCapacity + " kg";
    }
}

// Subclass 2 - ServiceRobot
class ServiceRobot extends Robot {
    String areaOfService;
    String aiVersion;

    ServiceRobot() {
        super();
        this.areaOfService = "Hospital Assistance";
        this.aiVersion = "v1.0";
    }

    ServiceRobot(int robotId, String model, double batteryLevel, String areaOfService, String aiVersion) {
        super(robotId, model, batteryLevel);
        this.areaOfService = areaOfService;
        this.aiVersion = aiVersion;
    }

    void setServiceRobot(int robotId, String model, double batteryLevel, String areaOfService, String aiVersion) {
        this.robotId = robotId;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.areaOfService = areaOfService;
        this.aiVersion = aiVersion;
    }

    String getAreaOfService() {
        return this.areaOfService;
    }

    String getAiVersion() {
        return this.aiVersion;
    }

    void performTask() {
        System.out.println(model + " is assisting in " + areaOfService +
                           " using AI version " + aiVersion + ".");
    }

    public String toString() {
        return "Robot Type: Service Robot" +
               "\nRobot ID: " + robotId +
               "\nModel: " + model +
               "\nBattery Level: " + batteryLevel + "%" +
               "\nArea of Service: " + areaOfService +
               "\nAI Version: " + aiVersion;
    }
}

// Test class with main()
class TestRobot {
    public static void main(String[] args) {

        Robot r1 = new IndustrialRobot(101, "Tata-Brabo-X", 85.5,
                                       "Material Handling", 120.0);

        Robot r2 = new ServiceRobot(202, "DeltaV-Helper", 92.0,
                                    "Medical Assistance", "v2.3");

        System.out.println(r1);
        r1.performTask();

        System.out.println("\n-----------------------------\n");

        System.out.println(r2);
        r2.performTask();
    }
}
