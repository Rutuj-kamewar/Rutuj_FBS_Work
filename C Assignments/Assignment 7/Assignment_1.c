//declarations
void add(int*, int*, int*);
void area_circle(int*, double*);
void fahrenheit(double*, double*);
void swap(int*, int*);
void average(int*, int*, int*, int*, int*, double*);
void square_cube(int*, int*, int*);
void convert_time(int*, int*, int*);
void perimeter_rectangle(int*, int*, int*);
void area_triangle(int*, int*, double*);
void result(int*, int*, int*, int*, int*, int*, double*);

//main starts
void main() {
    int choice;
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
        int a, b, sum;
        printf("Enter two integers: ");
        scanf("%d %d", &a, &b);
        add(&a, &b, &sum);
        printf("Sum = %d\n", sum);
    }
    else if (choice == 2) {
        int r;
        double result;
        printf("Enter radius: ");
        scanf("%d", &r);
        area_circle(&r, &result);
        printf("Area of circle = %.2f\n", result);
    }
    else if (choice == 3) {
        double c, f;
        printf("Enter temperature in Celsius: ");
        scanf("%lf", &c);
        fahrenheit(&c, &f);
        printf("Fahrenheit = %.2lf\n", f);
    }
    else if (choice == 4) {
        int a, b;
        printf("Enter two numbers: ");
        scanf("%d %d", &a, &b);
        printf("Before swap: a=%d b=%d\n", a, b);
        swap(&a, &b);
        printf("After swap: a=%d b=%d\n", a, b);
    }
    else if (choice == 5) {
        int a, b, c, d, e;
        double avg;
        printf("Enter 5 numbers: ");
        scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
        average(&a, &b, &c, &d, &e, &avg);
        printf("Average = %.2f\n", avg);
    }
    else if (choice == 6) {
        int n, sq, cube;
        printf("Enter a number: ");
        scanf("%d", &n);
        square_cube(&n, &sq, &cube);
        printf("Square = %d, Cube = %d\n", sq, cube);
    }
    else if (choice == 7) {
        int minutes, hours, rem;
        printf("Enter minutes: ");
        scanf("%d", &minutes);
        convert_time(&minutes, &hours, &rem);
        printf("%d minutes = %d hours and %d minutes\n", minutes, hours, rem);
    }
    else if (choice == 8) {
        int l, w, peri;
        printf("Enter length and width: ");
        scanf("%d %d", &l, &w);
        perimeter_rectangle(&l, &w, &peri);
        printf("Perimeter = %d\n", peri);
    }
    else if (choice == 9) {
        int base, height;
        double area;
        printf("Enter base and height: ");
        scanf("%d %d", &base, &height);
        area_triangle(&base, &height, &area);
        printf("Area of triangle = %.2f\n", area);
    }
    else if (choice == 10) {
        int m1, m2, m3, m4, m5, total;
        double percent;
        printf("Enter marks of 5 subjects: ");
        scanf("%d %d %d %d %d", &m1, &m2, &m3, &m4, &m5);
        result(&m1, &m2, &m3, &m4, &m5, &total, &percent);
        printf("Total = %d, Percentage = %.2lf%%\n", total, percent);
    }
    else {
        printf("Invalid choice!\n");
    }
}

//function definations

// Q1: Add two integers
void add(int* a, int* b, int* sum) {
    *sum = *a + *b;
}

// Q2: Area of a circle
void area_circle(int* r, double* area) {
    *area = 3.14 * (*r * *r);
}

// Q3: Celsius to Fahrenheit
void fahrenheit(double* c, double* f) {
    *f = (*c * 9 / 5) + 32;
}

// Q4: Swap two numbers
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Q5: Average of 5 numbers
void average(int* a, int* b, int* c, int* d, int* e, double* avg) {
    *avg = (*a + *b + *c + *d + *e) / 5.0;
}

// Q6: Square and cube
void square_cube(int* n, int* sq, int* cube) {
    *sq = (*n) * (*n);
    *cube = (*n) * (*n) * (*n);
}

// Q7: Minutes to Hours & Minutes
void convert_time(int* minutes, int* hours, int* rem) {
    *hours = *minutes / 60;
    *rem = *minutes % 60;
}

// Q8: Perimeter of rectangle
void perimeter_rectangle(int* l, int* w, int* peri) {
    *peri = 2 * (*l + *w);
}

// Q9: Area of triangle
void area_triangle(int* base, int* height, double* area) {
    *area = 0.5 * (*base) * (*height);
}

// Q10: Marks to Total & Percentage
void result(int* m1, int* m2, int* m3, int* m4, int* m5, int* total, double* percent) {
    *total = *m1 + *m2 + *m3 + *m4 + *m5;
    *percent = *total / 5.0;
}
