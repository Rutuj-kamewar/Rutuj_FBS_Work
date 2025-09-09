// Function type_2
int calculator();
int triangleType();
int greatestThree();
int resultMarks();
float discount();
int divisibleCheck();

void main() {
    int choice;
    printf("Menu:\n");
    printf("1. Calculator (+,-,*,/,%%)\n");
    printf("2. Triangle Type\n");
    printf("3. Greatest of Three Numbers\n");
    printf("4. Result from Marks\n");
    printf("5. Discount Calculation\n");
    printf("6. Divisible by 3 or 5\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    if (choice == 1) {
        int res = calculator();
        printf("Result = %d\n", res);
    }
    else if (choice == 2) {
        int res = triangleType();
        if (res == 1) printf("Equilateral Triangle\n");
        else if (res == 2) printf("Isosceles Triangle\n");
        else printf("Scalene Triangle\n");
    }
    else if (choice == 3) {
        int res = greatestThree();
        printf("Greatest = %d\n", res);
    }
    else if (choice == 4) {
        int res = resultMarks();
        if (res == 1) printf("Distinction\n");
        else if (res == 2) printf("First Class\n");
        else if (res == 3) printf("Second Class\n");
        else if (res == 4) printf("Pass Class\n");
        else printf("Fail\n");
    }
    else if (choice == 5) {
        float final = discount();
        printf("Final Price after discount = %.2f\n", final);
    }
    else if (choice == 6) {
        int res = divisibleCheck();
        if (res == 1) printf("Divisible by both 3 and 5\n");
        else if (res == 2) printf("Divisible by 3 but not by 5\n");
        else if (res == 3) printf("Divisible by 5 but not by 3\n");
        else printf("Divisible by None\n");
    }
    else {
        printf("Invalid choice!\n");
    }
}

// Q1: Calculator 
int calculator() {
    int a, b;
    char op;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    printf("Enter operator (+,-,*,/,%%): ");
    scanf(" %c", &op);

    switch(op) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return (b != 0) ? a / b : 0;
        case '%': return (b != 0) ? a % b : 0;
        default: return 0;
    }
}

// Q2: Triangle type 
int triangleType() {
    int a, b, c;
    printf("Enter three sides of triangle: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a == b && b == c) return 1;   // Equilateral
    else if (a == b || b == c || a == c) return 2;  // Isosceles
    else return 3;  // Scalene
}

// Q3: Greatest of three numbers 
int greatestThree() {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a > b) {
        if (a > c) return a;
        else return c;
    } else {
        if (b > c) return b;
        else return c;
    }
}

// Q4: Result from marks
int resultMarks() {
    int marks;
    printf("Enter marks: ");
    scanf("%d", &marks);

    if (marks > 75) return 1;      // Distinction
    else if (marks > 65) return 2; // First Class
    else if (marks > 55) return 3; // Second Class
    else if (marks >= 40) return 4;// Pass Class
    else return 5;                 // Fail
}

// Q5: Discount calculation ? 
float discount() {
    float price, discount;
    char student;
    printf("Enter total price: ");
    scanf("%f", &price);
    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);

    if (student == 'y' || student == 'Y') {
        if (price > 500) discount = 0.20 * price;
        else discount = 0.10 * price;
    } else {
        if (price > 600) discount = 0.15 * price;
        else discount = 0;
    }

    return price - discount; 
}

// Q6: Divisible check to
int divisibleCheck() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    if (n % 3 == 0 && n % 5 == 0) return 1;
    else if (n % 3 == 0) return 2;
    else if (n % 5 == 0) return 3;
    else return 4;
}
