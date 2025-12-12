package model;

public abstract class Device {

    protected String name;
    protected boolean isOn;
    protected long lastStateChange;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public Device() {
        this.name = "Unknown Device";
        this.isOn = false;
        this.lastStateChange = System.currentTimeMillis();
        System.out.println(name + " created");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public Device(String name) {
        this.name = name;
        this.isOn = false;
        this.lastStateChange = System.currentTimeMillis();
        System.out.println(name + " created");
    }

    // ---------------------------
    // TURN ON / TURN OFF
    // ---------------------------
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            lastStateChange = System.currentTimeMillis();
            System.out.println(name + " is now ON");
        } else {
            System.out.println(name + " is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            lastStateChange = System.currentTimeMillis();
            System.out.println(name + " is now OFF");
        } else {
            System.out.println(name + " is already OFF");
        }
    }

    // ---------------------------
    // TIME IN CURRENT STATE
    // ---------------------------
    public long getTimeInState() {
        long now = System.currentTimeMillis();
        return (now - lastStateChange) / 1000;  // seconds
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean getIsOn() { return isOn; }
    public void setIsOn(boolean isOn) { this.isOn = isOn; }

    public long getLastStateChange() { return lastStateChange; }
    public void setLastStateChange(long time) { this.lastStateChange = time; }

    // ---------------------------
    // STATUS
    // ---------------------------
    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }
}