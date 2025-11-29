package VehiclesAbstract;

//Superclass
abstract class Vehicle {
    String brand;
    String model;
    double price;
    static double taxRate = 8.5;

    Vehicle() {
        this.brand = "Unknown";
        this.model = "Base";
        this.price = 0.0;
    }

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    static void setTaxRate(double rate) {
        taxRate = rate;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(double price) {
        this.price = price;
    }

    static double getTaxRate() {
        return taxRate;
    }

    String getBrand() {
        return this.brand;
    }

    String getModel() {
        return this.model;
    }

    double getPrice() {
        return this.price;
    }

    double calculateTotalPrice() {
        return price + (price * taxRate / 100);
    }

    // ABSTRACT toString()
    public abstract String toString();
}

//Subclass 1 - Car
class Car extends Vehicle {
    int numberOfDoors;

    Car() {
        super();
        this.numberOfDoors = 4;
    }

    Car(String brand, String model, double price, int numberOfDoors) {
        super(brand, model, price);
        this.numberOfDoors = numberOfDoors;
    }

    void setCar(String brand, String model, double price, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.numberOfDoors = numberOfDoors;
    }

    int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public String toString() {
        return "Vehicle Type: Car" +
               "\nBrand: " + brand +
               "\nModel: " + model +
               "\nPrice: " + price +
               "\nNumber of Doors: " + numberOfDoors +
               "\nTax Rate: " + taxRate + "%" +
               "\nTotal Price (with Tax): " + calculateTotalPrice();
    }
}

//Subclass 2 - Bike
class Bike extends Vehicle {
    double engineCapacity; // CC

    Bike() {
        super();
        this.engineCapacity = 100.0;
    }

    Bike(String brand, String model, double price, double engineCapacity) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
    }

    void setBike(String brand, String model, double price, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    double getEngineCapacity() {
        return this.engineCapacity;
    }

    public String toString() {
        return "Vehicle Type: Bike" +
               "\nBrand: " + brand +
               "\nModel: " + model +
               "\nPrice: " + price +
               "\nEngine Capacity: " + engineCapacity + " CC" +
               "\nTax Rate: " + taxRate + "%" +
               "\nTotal Price (with Tax): " + calculateTotalPrice();
    }
}

class TestVehicle {
    public static void main(String[] args) {

        Vehicle c1 = new Car("Toyota", "Camry", 3500000.0, 4);

        Vehicle b1 = new Bike("Yamaha", "R15", 185000.0, 155.0);

        System.out.println(c1 + "\n--------------------------------------\n");
        System.out.println(b1);
    }
}
