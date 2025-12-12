package model;

public class SecurityDevice extends Device {

    private boolean armed;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public SecurityDevice() {
        super();
        this.armed = false;
        System.out.println("SecurityDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public SecurityDevice(String name) {
        super(name);
        this.armed = false;
        System.out.println("SecurityDevice created: " + name);
    }

    // ---------------------------
    // SECURITY ACTIONS
    // ---------------------------
    public void arm() {
        armed = true;
        System.out.println(name + " is now ARMED");
    }

    public void disarm() {
        armed = false;
        System.out.println(name + " is now DISARMED");
    }

    public void triggerAlarm() {
        System.out.println("!!! ALARM TRIGGERED on " + name + " !!!");
    }

    public void record() {
        System.out.println(name + " started recording footage");
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " security system activated");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " security system deactivated");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public boolean isArmed() { return armed; }
    public void setArmed(boolean armed) { this.armed = armed; }
}
