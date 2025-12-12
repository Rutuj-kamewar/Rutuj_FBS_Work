package model;

import model.interfaces.IVolumeControllable;

public class EntertainmentDevice extends Device implements IVolumeControllable {

    private int volume;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public EntertainmentDevice() {
        super();                
        this.volume = 5;       
        System.out.println("EntertainmentDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public EntertainmentDevice(String name) {
        super(name);          
        this.volume = 5;
        System.out.println("EntertainmentDevice created: " + name);
    }

    // ---------------------------
    // VOLUME CONTROL
    // ---------------------------
    @Override
    public void volumeUp() {
        volume++;
        System.out.println(name + " volume increased to " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println(name + " volume decreased to " + volume);
        } else {
            System.out.println(name + " volume is already at minimum");
        }
    }

    // ---------------------------
    // OVERRIDE TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is ready for entertainment!");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " shutting down entertainment features.");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
}
