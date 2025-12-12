package model;

import model.interfaces.ITemperatureControllable;

public class ACDevice extends Device implements ITemperatureControllable {

    private int temperature;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public ACDevice() {
        super();                // calls Device default constructor
        this.temperature = 24;  // default temperature
        System.out.println("ACDevice created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public ACDevice(String name) {
        super(name);            // calls Device(name)
        this.temperature = 24;
        System.out.println("ACDevice created: " + name);
    }

    // ---------------------------
    // TEMPERATURE CONTROL
    // ---------------------------
    @Override
    public void increaseTemp() {
        temperature++;
        System.out.println(name + " temperature increased to " + temperature + "°C");
    }

    @Override
    public void decreaseTemp() {
        if (temperature > 16) {
            temperature--;
            System.out.println(name + " temperature decreased to " + temperature + "°C");
        } else {
            System.out.println(name + " temperature is already at minimum");
        }
    }

    // ---------------------------
    // OVERRIDE TURN ON/OFF
    // ---------------------------
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " AC cooling started");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " AC cooling stopped");
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) { this.temperature = temperature; }
}
