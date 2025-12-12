package model;

public class WaterDevice extends Device {

    private boolean waterFlow;   // true = water is flowing
    private boolean heating;     // for devices like geysers

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public WaterDevice() {
        super();
        this.waterFlow = false;
        this.heating = false;
        System.out.println("WaterDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public WaterDevice(String name) {
        super(name);
        this.waterFlow = false;
        this.heating = false;
        System.out.println("WaterDevice created: " + name);
    }

    // ---------------------------
    // WATER ACTIONS
    // ---------------------------
    public void startWater() {
        if (!waterFlow) {
            waterFlow = true;
            System.out.println(name + " water flow started.");
        } else {
            System.out.println(name + " water is already flowing.");
        }
    }

    public void stopWater() {
        if (waterFlow) {
            waterFlow = false;
            System.out.println(name + " water flow stopped.");
        } else {
            System.out.println(name + " water is already OFF.");
        }
    }

    public void heatWater() {
        if (!heating) {
            heating = true;
            System.out.println(name + " is heating water...");
        } else {
            System.out.println(name + " is already heating.");
        }
    }

    public void stopHeating() {
        if (heating) {
            heating = false;
            System.out.println(name + " heating stopped.");
        } else {
            System.out.println(name + " heating is already OFF.");
        }
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " water system activated.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        waterFlow = false;
        heating = false;
        System.out.println(name + " water system turned OFF.");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public boolean isWaterFlow() { return waterFlow; }
    public void setWaterFlow(boolean flow) { this.waterFlow = flow; }

    public boolean isHeating() { return heating; }
    public void setHeating(boolean heating) { this.heating = heating; }
}
