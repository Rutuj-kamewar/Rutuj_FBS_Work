// Function type_3
void calculator(int a, int b, char op);
void triangleType(int a, int b, int c);
void greatestThree(int a, int b, int c);
void resultMarks(int marks);
void discount(float price, char student);
void divisibleCheck(int n);

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
        int a, b;
        char op;
        printf("Enter two numbers: ");
        scanf("%d %d", &a, &b);
        printf("Enter operator (+,-,*,/,%%): ");
        scanf(" %c", &op);
        calculator(a, b, op);
    }
    else if (choice == 2) {
        int a, b, c;
        printf("Enter three sides of triangle: ");
        scanf("%d %d %d", &a, &b, &c);
        triangleType(a, b, c);
    }
    else if (choice == 3) {
        int a, b, c;
        printf("Enter three numbers: ");
        scanf("%d %d %d", &a, &b, &c);
        greatestThree(a, b, c);
    }
    else if (choice == 4) {
        int marks;
        printf("Enter marks: ");
        scanf("%d", &marks);
        resultMarks(marks);
    }
    else if (choice == 5) {
        float price;
        char student;
        printf("Enter total price: ");
        scanf("%f", &price);
        printf("Are you a student? (y/n): ");
        scanf(" %c", &student);
        discount(price, student);
    }
    else if (choice == 6) {
        int n;
        printf("Enter a number: ");
        scanf("%d", &n);
        divisibleCheck(n);
    }
    else {
        printf("Invalid choice!\n");
    }
}

// Q1: Calculator ? with arguments, no return
void calculator(int a, int b, char op) {
    switch(op) {
        case '+': printf("Result = %d\n", a + b); break;
        case '-': printf("Result = %d\n", a - b); break;
        case '*': printf("Result = %d\n", a * b); break;
        case '/': 
            if (b != 0) printf("Result = %d\n", a / b);
            else printf("Division by zero error!\n");
            break;
        case '%': 
            if (b != 0) printf("Result = %d\n", a % b);
            else printf("Modulo by zero error!\n");
            break;
        default: printf("Invalid operator!\n");
    }
}

// Q2: Triangle type
void triangleType(int a, int b, int c) {
    if (a == b && b == c) printf("Equilateral Triangle\n");
    else if (a == b || b == c || a == c) printf("Isosceles Triangle\n");
    else printf("Scalene Triangle\n");
}

// Q3: Greatest of three numbers
void greatestThree(int a, int b, int c) {
    if (a > b && a > c) printf("Greatest = %d\n", a);
    else if (b > c) printf("Greatest = %d\n", b);
    else printf("Greatest = %d\n", c);
}

// Q4: Result from marks
void resultMarks(int marks) {
    if (marks > 75) printf("Distinction\n");
    else if (marks > 65) printf("First Class\n");
    else if (marks > 55) printf("Second Class\n");
    else if (marks >= 40) printf("Pass Class\n");
    else printf("Fail\n");
}

// Q5: Discount calculation
void discount(float price, char student) {
    float discount;
    if (student == 'y' || student == 'Y') {
        if (price > 500) discount = 0.20 * price;
        else discount = 0.10 * price;
    } else {
        if (price > 600) discount = 0.15 * price;
        else discount = 0;
    }
    printf("Final Price after discount = %.2f\n", price - discount);
}

// Q6: Divisible check
void divisibleCheck(int n) {
    if (n % 3 == 0 && n % 5 == 0) printf("Divisible by both 3 and 5\n");
    else if (n % 3 == 0) printf("Divisible by 3 but not by 5\n");
    else if (n % 5 == 0) printf("Divisible by 5 but not by 3\n");
    else printf("Divisible by None\n");
}
