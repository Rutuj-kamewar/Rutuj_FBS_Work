class Complex {
    double real;
    double imaginary;

    void setComplex(double r, double i) {
        real = r;
        imaginary = i;
    }

    void displayComplex() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c = new Complex();
        c.setComplex(4.5, 3.2);
        c.displayComplex();
    }
}
