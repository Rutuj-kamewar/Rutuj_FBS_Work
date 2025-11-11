package Shape;

// Superclass
class Shape {
    String color;
    static String type = "2D Shape"; // static variable

    // Default constructor
    Shape() {
        this.color = "Undefined";
    }

    // Parameterized constructor
    Shape(String color) {
        this.color = color;
    }

    // Setter
    void setColor(String color) {
        this.color = color;
    }

    // Getter
    String getColor() {
        return this.color;
    }

    // Static getter and setter
    static String getType() {
        return type;
    }

    static void setType(String t) {
        type = t;
    }

    // Generic display
    void display() {
        System.out.println("Shape Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("--------------------------------------");
    }

    // Generic area method (to be overridden)
    double calculateArea() {
        return 0.0;
    }
}

// Subclass 1 - Circle
class Circle extends Shape {
    double radius;

    // Default constructor
    Circle() {
        super();
        this.radius = 1.0;
    }

    // Parameterized constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Setter
    void setCircle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // Getter
    double getRadius() {
        return this.radius;
    }

    // Override area function
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display details
    void display() {
        System.out.println("Shape Type: Circle");
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Default constructor
    Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Setter
    void setRectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Getters
    double getLength() {
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    // Override area function
    double calculateArea() {
        return length * width;
    }

    // Display details
    void display() {
        System.out.println("Shape Type: Rectangle");
        System.out.println("Color: " + this.color);
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + calculateArea());
        System.out.println("--------------------------------------");
    }
}
class TestShape {
    public static void main(String[] args) {

        Circle c1 = new Circle("Red", 5.5);

        Rectangle r1 = new Rectangle("Blue", 4.0, 6.0);

        c1.display();
        r1.display();
    }
}
