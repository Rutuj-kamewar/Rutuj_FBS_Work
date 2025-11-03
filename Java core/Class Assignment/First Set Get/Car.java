class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

    void setCar(String m, String b, double p, String c, int f) {
        model = m;
        brand = b;
        price = p;
        color = c;
        fuelCapacity = f;
    }

    void displayCar() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Fuel Capacity: " + fuelCapacity);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setCar("Model S", "Tesla", 7500000, "White", 75);
        c.displayCar();
    }
}
