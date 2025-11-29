package ShapeAbstract;

// Superclass
abstract class Shape {
    String color;
    static String type = "2D Shape";

    Shape() {
        this.color = "Undefined";
    }

    Shape(String color) {
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    static String getType() {
        return type;
    }

    static void setType(String t) {
        type = t;
    }

    // ABSTRACT METHODS
    abstract double calculateArea();
    public abstract String toString();
}

// Subclass 1 - Circle
class Circle extends Shape {
    double radius;

    Circle() {
        super();
        this.radius = 1.0;
    }

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void setCircle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Shape Type: Circle" +
               "\nColor: " + color +
               "\nRadius: " + radius +
               "\nArea: " + calculateArea();
    }
}

// Subclass 2 - Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void setRectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    double calculateArea() {
        return length * width;
    }

    public String toString() {
        return "Shape Type: Rectangle" +
               "\nColor: " + color +
               "\nLength: " + length +
               "\nWidth: " + width +
               "\nArea: " + calculateArea();
    }
}

class TestShape {
    public static void main(String[] args) {

        Shape c1 = new Circle("Red", 5.5);
        Shape r1 = new Rectangle("Blue", 4.0, 6.0);

        System.out.println(c1);
        System.out.println("\n----------------------------\n");
        System.out.println(r1);
    }
}
