package model;

import model.interfaces.ISpeedControllable;

public class FanDevice extends Device implements ISpeedControllable {

    private int speed;  // fan speed level

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public FanDevice() {
        super();                // calls Device default constructor
        this.speed = 1;         // default speed
        System.out.println("FanDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public FanDevice(String name) {
        super(name);
        this.speed = 1;
        System.out.println("FanDevice created: " + name);
    }

    // ---------------------------
    // SPEED CONTROL
    // ---------------------------
    @Override
    public void increaseSpeed() {
        if (speed < 5) {  // assume max speed = 5
            speed++;
            System.out.println(name + " speed increased to level " + speed);
        } else {
            System.out.println(name + " is already at MAX speed");
        }
    }

    @Override
    public void decreaseSpeed() {
        if (speed > 1) {
            speed--;
            System.out.println(name + " speed decreased to level " + speed);
        } else {
            System.out.println(name + " is already at MIN speed");
        }
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " fan is rotating at speed " + speed);
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " fan has stopped");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}
