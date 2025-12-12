package model;

public class KitchenDevice extends Device {

    private boolean running;
    private int timer; // in minutes

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public KitchenDevice() {
        super();                // calls Device default constructor
        this.running = false;
        this.timer = 0;
        System.out.println("KitchenDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public KitchenDevice(String name) {
        super(name); 
        this.running = false;
        this.timer = 0;
        System.out.println("KitchenDevice created: " + name);
    }

    // ---------------------------
    // KITCHEN ACTIONS
    // ---------------------------
    public void start() {
        if (!running) {
            running = true;
            System.out.println(name + " started.");
        } else {
            System.out.println(name + " is already running.");
        }
    }

    public void stop() {
        if (running) {
            running = false;
            System.out.println(name + " stopped.");
        } else {
            System.out.println(name + " is already stopped.");
        }
    }

    public void setTimer(int minutes) {
        if (minutes > 0) {
            timer = minutes;
            System.out.println(name + " timer set to " + timer + " minutes.");
        } else {
            System.out.println("Invalid timer value for " + name);
        }
    }

    public void heat() {
        if (running) {
            System.out.println(name + " is heating food...");
        } else {
            System.out.println("Cannot heat; " + name + " is OFF or not running.");
        }
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is ready to cook.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        running = false; // stop the machine when OFF
        System.out.println(name + " is turned OFF and cooking stopped.");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public boolean isRunning() { return running; }
    public void setRunning(boolean running) { this.running = running; }

    public int getTimer() { return timer; }
    public void setTimerValue(int timer) { this.timer = timer; }
}
