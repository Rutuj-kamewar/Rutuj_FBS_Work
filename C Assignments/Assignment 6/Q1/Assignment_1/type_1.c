// Function type 1
void add();
void area_circle();
void fahrenheit();
void swap();
void average();
void square_cube();
void convert_time();
void perimeter_rectangle();
void area_triangle();
void result();

void main() {
    int choice;
    printf("Assignment 1 Menu\n");
    printf("1. Add two integers\n");
    printf("2. Area of a circle\n");
    printf("3. Celsius to Fahrenheit\n");
    printf("4. Swap two numbers\n");
    printf("5. Average of five numbers\n");
    printf("6. Square and Cube\n");
    printf("7. Minutes to Hours & Minutes\n");
    printf("8. Perimeter of Rectangle\n");
    printf("9. Area of Triangle\n");
    printf("10. Marks Total & Percentage\n");
    printf("Enter your choice (1-10): ");
    scanf("%d", &choice);

    if (choice == 1) {
        add();
    }
    else if (choice == 2) {
        area_circle();
    }
    else if (choice == 3) {
        fahrenheit();
    }
    else if (choice == 4) {
        swap();
    }
    else if (choice == 5) {
        average();
    }
    else if (choice == 6) {
        square_cube();
    }
    else if (choice == 7) {
        convert_time();
    }
    else if (choice == 8) {
        perimeter_rectangle();
    }
    else if (choice == 9) {
        area_triangle();
    }
    else if (choice == 10) {
        result();
    }
    else {
        printf("Invalid choice!\n");
    }
}

// Q1: Add two integers
void add() {
    int a, b;
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);
    printf("Sum = %d\n", a + b);
}

// Q2: Area of a circle
void area_circle() {
    int r;
    printf("Enter radius: ");
    scanf("%d", &r);
    printf("Area of circle = %.2f\n", 3.14 * r * r);
}

// Q3: Celsius ? Fahrenheit
void fahrenheit() {
    float c;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &c);
    float f = (c * 9 / 5) + 32;
    printf("Fahrenheit = %.2f\n", f);
}

// Q4: Swap two numbers
void swap() {
    int a, b, temp;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    printf("Before swap: a=%d b=%d\n", a, b);
    temp = a;
    a = b;
    b = temp;
    printf("After swap: a=%d b=%d\n", a, b);
}

// Q5: Average of 5 numbers
void average() {
    int a, b, c, d, e;
    printf("Enter 5 numbers: ");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
    printf("Average = %.2f\n", (a + b + c + d + e) / 5.0);
}

// Q6: Square and cube
void square_cube() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("Square = %d, Cube = %d\n", n*n, n*n*n);
}

// Q7: Minutes to Hours & Minutes
void convert_time() {
    int minutes;
    printf("Enter minutes: ");
    scanf("%d", &minutes);
    printf("%d minutes = %d hours and %d minutes\n", minutes, minutes/60, minutes%60);
}

// Q8: Perimeter of rectangle
void perimeter_rectangle() {
    int l, w;
    printf("Enter length and width: ");
    scanf("%d %d", &l, &w);
    printf("Perimeter = %d\n", 2 * (l + w));
}

// Q9: Area of triangle
void area_triangle() {
    int base, height;
    printf("Enter base and height: ");
    scanf("%d %d", &base, &height);
    printf("Area of triangle = %.2f\n", 0.5 * base * height);
}

// Q10: Marks ? Total & Percentage
void result() {
    int m1, m2, m3, m4, m5;
    printf("Enter marks of 5 subjects: ");
    scanf("%d %d %d %d %d", &m1, &m2, &m3, &m4, &m5);
    int total = m1+m2+m3+m4+m5;
    float percent = total / 5.0;
    printf("Total = %d, Percentage = %.2f%%\n", total, percent);
}
