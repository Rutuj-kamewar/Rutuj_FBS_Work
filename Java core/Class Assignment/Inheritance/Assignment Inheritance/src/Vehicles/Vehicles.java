package Vehicles;

//Superclass
class Vehicle {
 String brand;
 String model;
 double price;
 static double taxRate = 8.5;

 // Default constructor
 Vehicle() {
     this.brand = "Unknown";
     this.model = "Base";
     this.price = 0.0;
 }

 // Parameterized constructor
 Vehicle(String brand, String model, double price) {
     this.brand = brand;
     this.model = model;
     this.price = price;
 }

 // Setters
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

 // Getters
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

 // Function to calculate total price including tax
 double calculateTotalPrice() {
     return price + (price * taxRate / 100);
 }

 // Display details
 void display() {
     System.out.println("Vehicle Brand: " + brand);
     System.out.println("Vehicle Model: " + model);
     System.out.println("Base Price: " + price);
     System.out.println("Tax Rate: " + taxRate + "%");
     System.out.println("Total Price (with Tax): " + calculateTotalPrice());
 }
}

//Subclass 1 - Car
class Car extends Vehicle {
 int numberOfDoors;

 // Default constructor
 Car() {
     super();
     this.numberOfDoors = 4;
 }

 // Parameterized constructor
 Car(String brand, String model, double price, int numberOfDoors) {
     super(brand, model, price);
     this.numberOfDoors = numberOfDoors;
 }

 // Setters
 void setCar(String brand, String model, double price, int numberOfDoors) {
     this.brand = brand;
     this.model = model;
     this.price = price;
     this.numberOfDoors = numberOfDoors;
 }

 // Getters
 int getNumberOfDoors() {
     return this.numberOfDoors;
 }

 // Display details
 void display() {
     System.out.println("Car Brand: " + this.brand);
     System.out.println("Car Model: " + this.model);
     System.out.println("Price: " + this.price);
     System.out.println("Number of Doors: " + this.numberOfDoors);
     System.out.println("Total Price (with Tax): " + calculateTotalPrice());
     System.out.println("--------------------------------------");
 }
}

//Subclass 2 - Bike
class Bike extends Vehicle {
 double engineCapacity; // in CC

 // Default constructor
 Bike() {
     super();
     this.engineCapacity = 100.0;
 }

 // Parameterized constructor
 Bike(String brand, String model, double price, double engineCapacity) {
     super(brand, model, price);
     this.engineCapacity = engineCapacity;
 }

 // Setters
 void setBike(String brand, String model, double price, double engineCapacity) {
     this.brand = brand;
     this.model = model;
     this.price = price;
     this.engineCapacity = engineCapacity;
 }

 // Getters
 double getEngineCapacity() {
     return this.engineCapacity;
 }

 // Display details
 void display() {
     System.out.println("Bike Brand: " + this.brand);
     System.out.println("Bike Model: " + this.model);
     System.out.println("Price: " + this.price);
     System.out.println("Engine Capacity: " + this.engineCapacity + " CC");
     System.out.println("Total Price (with Tax): " + calculateTotalPrice());
 }
}
class TestVehicle {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Camry", 3500000.0, 4);

        Bike b1 = new Bike("Yamaha", "R15", 185000.0, 155.0);

        c1.display();
        b1.display();
    }
}
