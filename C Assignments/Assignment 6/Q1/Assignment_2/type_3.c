// Function type 3
void evenOdd(int n);
void palindrome(int n);
void leapYear(int year);
void vowelConsonant(char ch);
void voting(int age);
void checkChar(char ch);
void salary(float basic);

void main() {
    int choice;
    printf("Assignment 1 (Second PDF) Menu\n");
    printf("1. Even or Odd\n");
    printf("2. Palindrome (3-digit number)\n");
    printf("3. Leap Year\n");
    printf("4. Vowel or Consonant\n");
    printf("5. Voting Eligibility\n");
    printf("6. Uppercase or Lowercase\n");
    printf("7. Salary Calculation\n");
    printf("Enter your choice (1-7): ");
    scanf("%d", &choice);

    if (choice == 1) {
        int n;
        printf("Enter a number: ");
        scanf("%d", &n);
        evenOdd(n);
    }
    else if (choice == 2) {
        int n;
        printf("Enter a 3-digit number: ");
        scanf("%d", &n);
        palindrome(n);
    }
    else if (choice == 3) {
        int year;
        printf("Enter a year: ");
        scanf("%d", &year);
        leapYear(year);
    }
    else if (choice == 4) {
        char ch;
        printf("Enter a character: ");
        scanf(" %c", &ch);
        vowelConsonant(ch);
    }
    else if (choice == 5) {
        int age;
        printf("Enter age: ");
        scanf("%d", &age);
        voting(age);
    }
    else if (choice == 6) {
        char ch;
        printf("Enter a character: ");
        scanf(" %c", &ch);
        checkChar(ch);
    }
    else if (choice == 7) {
        float basic;
        printf("Enter basic salary: ");
        scanf("%f", &basic);
        salary(basic);
    }
    else {
        printf("Invalid choice!\n");
    }
}

// Q1: Even or Odd
void evenOdd(int n) {
    if (n % 2 == 0)
        printf("%d is Even\n", n);
    else
        printf("%d is Odd\n", n);
}

// Q2: Palindrome
void palindrome(int n) {
    int original = n, rev = 0;
    while (n > 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
    }
    if (rev == original)
        printf("%d is a Palindrome\n", original);
    else
        printf("%d is NOT a Palindrome\n", original);
}

// Q3: Leap Year
void leapYear(int year) {
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        printf("%d is a Leap Year\n", year);
    else
        printf("%d is NOT a Leap Year\n", year);
}

// Q4: Vowel or Consonant
void vowelConsonant(char ch) {
    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        printf("%c is a Vowel\n", ch);
    else
        printf("%c is a Consonant\n", ch);
}

// Q5: Voting Eligibility
void voting(int age) {
    if (age >= 18)
        printf("Eligible to vote\n");
    else
        printf("Not eligible to vote\n");
}

// Q6: Uppercase or Lowercase
void checkChar(char ch) {
    if (ch >= 'A' && ch <= 'Z')
        printf("%c is Uppercase\n", ch);
    else if (ch >= 'a' && ch <= 'z')
        printf("%c is Lowercase\n", ch);
    else
        printf("%c is not an alphabet\n", ch);
}

// Q7: Salary Calculation
void salary(float basic) {
    float da, ta, hra, gross;
    if (basic <= 5000) {
        da = 0.10 * basic;
        ta = 0.20 * basic;
        hra = 0.25 * basic;
    } else {
        da = 0.15 * basic;
        ta = 0.25 * basic;
        hra = 0.30 * basic;
    }
    gross = basic + da + ta + hra;
    printf("Gross Salary = %.2f\n", gross);
}
