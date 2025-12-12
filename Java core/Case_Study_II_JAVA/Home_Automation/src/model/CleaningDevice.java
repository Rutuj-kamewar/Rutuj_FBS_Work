package model;

public class CleaningDevice extends Device {

    private boolean cleaning;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public CleaningDevice() {
        super();
        this.cleaning = false;
        System.out.println("CleaningDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public CleaningDevice(String name) {
        super(name);
        this.cleaning = false;
        System.out.println("CleaningDevice created: " + name);
    }

    // ---------------------------
    // CLEANING ACTIONS
    // ---------------------------
    public void startCleaning() {
        if (!cleaning) {
            cleaning = true;
            System.out.println(name + " has started cleaning.");
        } else {
            System.out.println(name + " is already cleaning.");
        }
    }

    public void stopCleaning() {
        if (cleaning) {
            cleaning = false;
            System.out.println(name + " has stopped cleaning.");
        } else {
            System.out.println(name + " is not currently cleaning.");
        }
    }

    public void pauseCleaning() {
        if (cleaning) {
            cleaning = false;
            System.out.println(name + " cleaning paused.");
        } else {
            System.out.println(name + " cannot pause; it is not cleaning.");
        }
    }

    public void resumeCleaning() {
        if (!cleaning) {
            cleaning = true;
            System.out.println(name + " resumed cleaning.");
        } else {
            System.out.println(name + " is already cleaning.");
        }
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is powered ON and ready to clean.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        cleaning = false;
        System.out.println(name + " is powered OFF.");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public boolean isCleaning() { return cleaning; }
    public void setCleaning(boolean cleaning) { this.cleaning = cleaning; }
}
