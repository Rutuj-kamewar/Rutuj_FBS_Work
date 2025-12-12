package controller;

import model.*;
import model.interfaces.*;

import java.util.ArrayList;

public class HomeController {

    private ArrayList<Room> rooms;

    // ---------------------------
    // CONSTRUCTOR
    // ---------------------------
    public HomeController() {
        rooms = new ArrayList<>();
        System.out.println("HomeController initialized.");
    }

    // ---------------------------
    // ROOM OPERATIONS
    // ---------------------------
    public void addRoom(String roomName) {
        rooms.add(new Room(roomName));
        System.out.println("Room added: " + roomName);
    }

    public Room getRoom(String roomName) {
        for (Room r : rooms) {
            if (r.getRoomName().equalsIgnoreCase(roomName)) {
                return r;
            }
        }
        return null;
    }

    public boolean validateRoom(String roomName) {
        return getRoom(roomName) != null;
    }

    public ArrayList<Room> getAllRooms() {
        return rooms;
    }

    // ---------------------------
    // ADD DEVICE TO ROOM
    // ---------------------------
    public void addDeviceToRoom(Room room, Device device) {
        room.addDevice(device);
    }

    // ---------------------------
    // DEVICE OPERATIONS
    // ---------------------------
    public void turnOnDevice(Device d) {
        if (d != null) d.turnOn();
    }

    public void turnOffDevice(Device d) {
        if (d != null) d.turnOff();
    }

    // ---------------------------
    // DEVICE-SPECIFIC ACTIONS
    // ---------------------------
    public void increaseVolume(Device d) {
        if (d instanceof IVolumeControllable) {
            ((IVolumeControllable)d).volumeUp();
        } else {
            System.out.println(d.getName() + " does not support volume.");
        }
    }

    public void decreaseVolume(Device d) {
        if (d instanceof IVolumeControllable) {
            ((IVolumeControllable)d).volumeDown();
        } else {
            System.out.println(d.getName() + " does not support volume.");
        }
    }

    public void increaseBrightness(Device d) {
        if (d instanceof IBrightnessControllable) {
            ((IBrightnessControllable)d).increaseBrightness();
        } else {
            System.out.println(d.getName() + " does not support brightness.");
        }
    }

    public void decreaseBrightness(Device d) {
        if (d instanceof IBrightnessControllable) {
            ((IBrightnessControllable)d).decreaseBrightness();
        } else {
            System.out.println(d.getName() + " does not support brightness.");
        }
    }

    public void increaseTemp(Device d) {
        if (d instanceof ITemperatureControllable) {
            ((ITemperatureControllable)d).increaseTemp();
        } else {
            System.out.println(d.getName() + " does not support temperature.");
        }
    }

    public void decreaseTemp(Device d) {
        if (d instanceof ITemperatureControllable) {
            ((ITemperatureControllable)d).decreaseTemp();
        } else {
            System.out.println(d.getName() + " does not support temperature.");
        }
    }

    public void increaseSpeed(Device d) {
        if (d instanceof ISpeedControllable) {
            ((ISpeedControllable)d).increaseSpeed();
        } else {
            System.out.println(d.getName() + " does not support speed.");
        }
    }

    public void decreaseSpeed(Device d) {
        if (d instanceof ISpeedControllable) {
            ((ISpeedControllable)d).decreaseSpeed();
        } else {
            System.out.println(d.getName() + " does not support speed.");
        }
    }

    // ---------------------------
    // SCENE MODES
    // ---------------------------
    public void activateScene(String scene) {
        System.out.println("Activating scene: " + scene);

        if (scene.equalsIgnoreCase("Movie Mode")) {
            for (Room room : rooms) {
                for (Device d : room.getDevices()) {
                    if (d instanceof EntertainmentDevice) {
                        d.turnOn();
                    }
                    if (d instanceof LightDevice) {
                        ((LightDevice)d).decreaseBrightness();
                    }
                }
            }
        }
        // You can add more scenes later...
    }

    // ---------------------------
    // AUTO-SHUTOFF (optional)
    // ---------------------------
    public void autoShutoff() {
        for (Room r : rooms) {
            for (Device d : r.getDevices()) {
                long time = d.getTimeInState();
                if (d.getIsOn() && time > 300) {  // 5 minutes
                    System.out.println("Auto-shutoff: Turning off " + d.getName());
                    d.turnOff();
                }
            }
        }
    }
}
