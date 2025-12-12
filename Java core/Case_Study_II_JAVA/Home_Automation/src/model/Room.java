package model;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private ArrayList<Device> devices;

    // ---------------------------
    // DEFAULT CONSTRUCTOR
    // ---------------------------
    public Room() {
        this.roomName = "Unnamed Room";
        this.devices = new ArrayList<>();
        System.out.println("Room created (default)");
    }

    // ---------------------------
    // PARAMETERIZED CONSTRUCTOR
    // ---------------------------
    public Room(String roomName) {
        this.roomName = roomName;
        this.devices = new ArrayList<>();
        System.out.println("Room created: " + roomName);
    }

    // ---------------------------
    // ADD DEVICE
    // ---------------------------
    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getName() + " added to " + roomName);
    }

    // ---------------------------
    // REMOVE DEVICE BY NAME
    // ---------------------------
    public void removeDevice(String name) {
        Device d = getDevice(name);
        if (d != null) {
            devices.remove(d);
            System.out.println(name + " removed from " + roomName);
        } else {
            System.out.println("No such device found in " + roomName);
        }
    }

    // ---------------------------
    // GET DEVICE BY NAME
    // ---------------------------
    public Device getDevice(String name) {
        for (Device d : devices) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    // ---------------------------
    // ROOM SUMMARY
    // ---------------------------
    public String getRoomSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room: ").append(roomName).append("\n");
        sb.append("Devices:\n");

        if (devices.isEmpty()) {
            sb.append("  No devices in this room.\n");
        } else {
            for (Device d : devices) {
                sb.append("  - ").append(d.getName())
                  .append(" (").append(d.getStatus()).append(")\n");
            }
        }
        return sb.toString();
    }

    // ---------------------------
    // COUNT DEVICES ON / OFF
    // ---------------------------
    public int getDevicesOnCount() {
        int count = 0;
        for (Device d : devices) {
            if (d.getIsOn()) count++;
        }
        return count;
    }

    public int getDevicesOffCount() {
        int count = 0;
        for (Device d : devices) {
            if (!d.getIsOn()) count++;
        }
        return count;
    }

    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public String getRoomName() { return roomName; }
    public void setRoomName(String roomName) { this.roomName = roomName; }

    public ArrayList<Device> getDevices() { return devices; }
    public void setDevices(ArrayList<Device> devices) { this.devices = devices; }
}
