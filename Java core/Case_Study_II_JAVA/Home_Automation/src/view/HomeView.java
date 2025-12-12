package view;

import controller.HomeController;
import model.*;
import java.util.Scanner;

public class HomeView {

    private HomeController controller;
    private Scanner sc = new Scanner(System.in);

    public HomeView(HomeController controller) {
        this.controller = controller;
    }

    // ---------------------------
    // START MENU
    // ---------------------------
    public void start() {
        while (true) {
            System.out.println("\n===== HOME AUTOMATION SYSTEM =====");
            System.out.println("1. Add Room");
            System.out.println("2. Add Device to Room");
            System.out.println("3. Turn ON Device");
            System.out.println("4. Turn OFF Device");
            System.out.println("5. Device-Specific Actions");
            System.out.println("6. Show Room Summary");
            System.out.println("7. Show All Rooms");
            System.out.println("8. Activate Scene");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addRoomMenu();
                case 2 -> addDeviceMenu();
                case 3 -> turnOnMenu();
                case 4 -> turnOffMenu();
                case 5 -> deviceActionsMenu();
                case 6 -> roomSummaryMenu();
                case 7 -> showAllRoomsMenu();
                case 8 -> sceneMenu();
                case 9 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    // ---------------------------
    // MENU: ADD ROOM
    // ---------------------------
    private void addRoomMenu() {
        System.out.print("Enter Room Name: ");
        String name = sc.nextLine();
        controller.addRoom(name);
    }

    // ---------------------------
    // MENU: ADD DEVICE
    // ---------------------------
    private void addDeviceMenu() {
        System.out.print("Enter Room Name: ");
        String roomName = sc.nextLine();

        if (!controller.validateRoom(roomName)) {
            System.out.println("Room not found!");
            return;
        }

        Room room = controller.getRoom(roomName);

        System.out.println("Select Device Type:");
        System.out.println("1. Entertainment Device");
        System.out.println("2. AC Device");
        System.out.println("3. Light Device");
        System.out.println("4. Fan Device");
        System.out.println("5. Security Device");
        System.out.println("6. Cleaning Device");
        System.out.println("7. Kitchen Device");
        System.out.println("8. Water Device");

        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Device Name: ");
        String deviceName = sc.nextLine();

        Device device = switch (type) {
            case 1 -> new EntertainmentDevice(deviceName);
            case 2 -> new ACDevice(deviceName);
            case 3 -> new LightDevice(deviceName);
            case 4 -> new FanDevice(deviceName);
            case 5 -> new SecurityDevice(deviceName);
            case 6 -> new CleaningDevice(deviceName);
            case 7 -> new KitchenDevice(deviceName);
            case 8 -> new WaterDevice(deviceName);
            default -> null;
        };

        if (device != null) {
            controller.addDeviceToRoom(room, device);
        }
    }

    // ---------------------------
    // TURN ON DEVICE
    // ---------------------------
    private void turnOnMenu() {
        Device d = getDeviceByRoomAndName();
        if (d != null) controller.turnOnDevice(d);
    }

    // ---------------------------
    // TURN OFF DEVICE
    // ---------------------------
    private void turnOffMenu() {
        Device d = getDeviceByRoomAndName();
        if (d != null) controller.turnOffDevice(d);
    }

    // ---------------------------
    // DEVICE ACTIONS MENU
    // ---------------------------
    private void deviceActionsMenu() {
        Device d = getDeviceByRoomAndName();
        if (d == null) return;

        System.out.println("Choose Action:");
        System.out.println("1. Increase Volume");
        System.out.println("2. Decrease Volume");
        System.out.println("3. Increase Brightness");
        System.out.println("4. Decrease Brightness");
        System.out.println("5. Increase Temperature");
        System.out.println("6. Decrease Temperature");
        System.out.println("7. Increase Speed");
        System.out.println("8. Decrease Speed");

        int action = sc.nextInt();
        sc.nextLine();

        switch (action) {
            case 1 -> controller.increaseVolume(d);
            case 2 -> controller.decreaseVolume(d);
            case 3 -> controller.increaseBrightness(d);
            case 4 -> controller.decreaseBrightness(d);
            case 5 -> controller.increaseTemp(d);
            case 6 -> controller.decreaseTemp(d);
            case 7 -> controller.increaseSpeed(d);
            case 8 -> controller.decreaseSpeed(d);
            default -> System.out.println("Invalid action!");
        }
    }

    // ---------------------------
    // ROOM SUMMARY
    // ---------------------------
    private void roomSummaryMenu() {
        System.out.print("Enter Room Name: ");
        String roomName = sc.nextLine();

        Room r = controller.getRoom(roomName);
        if (r == null) {
            System.out.println("Room not found!");
            return;
        }

        System.out.println(r.getRoomSummary());
    }

    // ---------------------------
    // SHOW ALL ROOMS
    // ---------------------------
    private void showAllRoomsMenu() {
        for (Room r : controller.getAllRooms()) {
            System.out.println(r.getRoomSummary());
        }
    }

    // ---------------------------
    // SCENE MENU
    // ---------------------------
    private void sceneMenu() {
        System.out.println("Available Scenes:");
        System.out.println("1. Movie Mode");

        int s = sc.nextInt();
        sc.nextLine();

        if (s == 1) controller.activateScene("Movie Mode");
        else System.out.println("Invalid Scene");
    }

    // ---------------------------
    // HELPER: GET DEVICE
    // ---------------------------
    private Device getDeviceByRoomAndName() {
        System.out.print("Enter Room Name: ");
        String roomName = sc.nextLine();

        Room r = controller.getRoom(roomName);
        if (r == null) {
            System.out.println("Room not found!");
            return null;
        }

        System.out.print("Enter Device Name: ");
        String deviceName = sc.nextLine();

        Device d = r.getDevice(deviceName);
        if (d == null) System.out.println("Device not found!");
        return d;
    }
}
