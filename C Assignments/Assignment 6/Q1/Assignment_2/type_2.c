// Function type 2
int evenOdd();
int palindrome();
int leapYear();
void vowelConsonant();
int voting();
char checkChar();
float salary();

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
        if (evenOdd()) printf("Number is Even\n");
        else printf("Number is Odd\n");
    }
    else if (choice == 2) {
        if (palindrome()) printf("Number is Palindrome\n");
        else printf("Number is NOT Palindrome\n");
    }
    else if (choice == 3) {
        if (leapYear()) printf("It is a Leap Year\n");
        else printf("It is NOT a Leap Year\n");
    }
    else if (choice == 4) {
        vowelConsonant();
        
    }
    else if (choice == 5) {
        if ( voting()) printf("Eligible to vote\n");
        else printf("Not eligible to vote\n");
    }
    else if (choice == 6) {
        char res = checkChar();
        if (res == 'U') printf("Character is Uppercase\n");
        else if (res == 'L') printf("Character is Lowercase\n");
        else printf("Not an alphabet\n");
    }
    else if (choice == 7) {
        printf("Gross Salary = %.2f\n", salary());
    }
    else {
        printf("Invalid choice!\n");
    }
}

// Q1: Even or Odd
int evenOdd() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n % 2 == 0) return 1;  
    else return 0;             
}

// Q2: Palindrome
int palindrome() {
    int n;
    printf("Enter a 3-digit number: ");
    scanf("%d", &n);
    int original = n, rev = 0;
    while (n > 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
    }
    if (rev == original) return 1;
    else return 0;
}

// Q3: Leap Year
int leapYear() {
    int year;
    printf("Enter a year: ");
    scanf("%d", &year);
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        return 1;
    else
        return 0;
}

// Q4: Vowel or Consonant
void vowelConsonant() {
    char res;
    printf("Enter a character: ");
    scanf(" %c", &res);
    printf("%c is a %s\n", res,
               (res=='a'||res=='e'||res=='i'||res=='o'||res=='u'||
                res=='A'||res=='E'||res=='I'||res=='O'||res=='U')
               ? "Vowel" : "Consonant");
}

// Q5: Voting Eligibility
int voting() {
    int age;
    printf("Enter age: ");
    scanf("%d", &age);
    if (age >= 18) return 1;
    else return 0;
}

// Q6: Uppercase or Lowercase
char checkChar() {
    char ch;
    printf("Enter a character: ");
    scanf(" %c", &ch);
    if (ch >= 'A' && ch <= 'Z')
        return 'U';   // Uppercase
    else if (ch >= 'a' && ch <= 'z')
        return 'L';   // Lowercase
    else
        return 'N';  
}

// Q7: Salary Calculation
float salary() {
    float basic, da, ta, hra, gross;
    printf("Enter basic salary: ");
    scanf("%f", &basic);

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
    return gross;
}
