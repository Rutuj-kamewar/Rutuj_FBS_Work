package model;

import model.interfaces.IBrightnessControllable;

public class LightDevice extends Device implements IBrightnessControllable {

    private int brightness;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public LightDevice() {
        super();                // Device default constructor
        this.brightness = 50;   // default brightness
        System.out.println("LightDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public LightDevice(String name) {
        super(name);
        this.brightness = 50;
        System.out.println("LightDevice created: " + name);
    }

    // ---------------------------
    // BRIGHTNESS CONTROL
    // ---------------------------
    @Override
    public void increaseBrightness() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println(name + " brightness increased to " + brightness + "%");
        } else {
            System.out.println(name + " brightness is already at maximum");
        }
    }

    @Override
    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println(name + " brightness decreased to " + brightness + "%");
        } else {
            System.out.println(name + " brightness is already at minimum");
        }
    }

    // ---------------------------
    // TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " light is now illuminating");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " light is turned off");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public int getBrightness() { return brightness; }
    public void setBrightness(int brightness) { this.brightness = brightness; }
}
