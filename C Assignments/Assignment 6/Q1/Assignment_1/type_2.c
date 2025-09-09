int add();
float area_circle();
float fahrenheit();
void swap();
float average();
void square_cube();
voidconvert_time();
int perimeter_rectangle();
float area_triangle();
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
        
        printf("Sum = %d\n", add());
    }
    else if (choice == 2) {
       
        printf("Area of circle = %.2f\n", area_circle());
    }
    else if (choice == 3) {
    	
        printf("Fahrenheit = %.2f\n", fahrenheit());     
    }
    else if (choice == 4) {
        
        swap();
    }
    else if (choice == 5) {
        
        printf("Average = %.2f\n", average());
    }
    else if (choice == 6) {
        
        square_cube();
    }
    else if (choice == 7) {
       
        convert_time();
    }
    else if (choice == 8) {
        
        printf("Perimeter = %d\n", perimeter_rectangle());
    }
    else if (choice == 9) {
       
        printf("Area of triangle = %.2f\n", area_triangle());
    }
    else if (choice == 10) {
        result();
    }
    else {
        printf("Invalid choice!\n");
    }
}









// Q1: Add two integers
int add() {
	int a, b;
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);
    return a + b;
}

// Q2: Area of a circle
float area_circle() {
	int r;
    printf("Enter radius: ");
    scanf("%d", &r);
    return 3.14 * r * r;
}

// Q3: Celsius ? Fahrenheit
float fahrenheit() {
	float c;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &c);
    float f = (c * 9 / 5) + 32;
    return f;
    
}

// Q4: Swap two numbers
void swap() {
	int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    int temp;
    printf("Before swap: a=%d b=%d\n", a, b);
    temp = a;
    a = b;
    b = temp;
    printf("After swap: a=%d b=%d\n", a, b);
}

// Q5: Average of 5 numbers
float average() {
	int a,b,c,d,e;
    printf("Enter 5 numbers: ");
    scanf("%d %d %d %d %d", &a,&b,&c,&d,&e);
    return (a + b + c + d + e) / 5.0;
}

// Q6: Square and cube
void square_cube() {
	int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("Square = %d, Cube = %d\n", n*n, n*n*n); 
}

// Q7: Minutes to hours and minutes
void convert_time() {
	 int minutes;
    printf("Enter minutes: ");
    scanf("%d", &minutes);
    printf("%d minutes = %d hours and %d minutes\n", minutes, minutes/60, minutes%60);
}

// Q8: Perimeter of rectangle
int perimeter_rectangle() {
	int l, w;
    printf("Enter length and width: ");
    scanf("%d %d", &l, &w);
    return 2 * (l + w);
}

// Q9: Area of triangle
float area_triangle() {
	int base, height;
    printf("Enter base and height: ");
    scanf("%d %d", &base, &height);
    return 0.5 * base * height;
}

// Q10: Marks ? total & percentage
void result() {
    int m1, m2, m3, m4, m5;
    printf("Enter marks of 5 subjects: ");
    scanf("%d %d %d %d %d", &m1, &m2, &m3, &m4, &m5);
    int total = m1+m2+m3+m4+m5;
    float percent = total/5.0;
    printf("Total = %d, Percentage = %.2f%%\n", total, percent);
}
