//type 1
void print1to10();
void printTable();
void sumRange();
void checkPrime();
void checkArmstrong();
void checkPerfect();
void factorial();
void checkStrong();
void checkPalindrome();
void sumFirstLast();

//Menu
void main() {
    int choice;
    printf("1. Print 1 to 10\n");
    printf("2. Print Table\n");
    printf("3. Sum in Range\n");
    printf("4. Prime Check\n");
    printf("5. Armstrong Check\n");
    printf("6. Perfect Check\n");
    printf("7. Factorial\n");
    printf("8. Strong Check\n");
    printf("9. Palindrome Check\n");
    printf("10. Sum of First & Last Digit\n");
    printf("Enter choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        print1to10();
    }
    else if (choice == 2) {
        printTable();
    }
    else if (choice == 3) {
        sumRange();
    }
    else if (choice == 4) {
        checkPrime();
    }
    else if (choice == 5) {
        checkArmstrong();
    }
    else if (choice == 6) {
        checkPerfect();
    }
    else if (choice == 7) {
        factorial();
    }
    else if (choice == 8) {
        checkStrong();
    }
    else if (choice == 9) {
        checkPalindrome();
    }
    else if (choice == 10) {
        sumFirstLast();
    }
    else {
        printf("Invalid choice!\n");
    }
}

// 1. Print numbers from 1 to 10
void print1to10() {
    for (int i = 1; i <= 10; i++)
        printf("%d ", i);
    printf("\n");
}

// 2. Print table for given number
void printTable() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    for (int i = 1; i <= 10; i++)
        printf("%d ", n * i);
    printf("\n");
}

// 3. Sum of numbers in range
void sumRange() {
    int start, end, sum = 0;
    printf("Enter start and end: ");
    scanf("%d %d", &start, &end);
    for (int i = start; i <= end; i++)
        sum += i;
    printf("Sum = %d\n", sum);
}

// 4. Prime number check
void checkPrime() {
    int n, i, flag = 1;
    printf("Enter number: ");
    scanf("%d", &n);
    if (n <= 1) flag = 0;
    else {
        for (i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = 0; break;
            }
        }
    }
    if (flag) printf("Prime\n");
    else printf("Not Prime\n");
}

// 5. Armstrong number check
void checkArmstrong() {
    int n, sum = 0, temp, digit;
    printf("Enter number: ");
    scanf("%d", &n);
    temp = n;
    while (temp > 0) {
        digit = temp % 10;
        sum += digit*digit*digit;
        temp /= 10;
    }
    if (sum == n) printf("Armstrong\n");
    else printf("Not Armstrong\n");
}

// 6. Perfect number check
void checkPerfect() {
    int n, sum = 0;
    printf("Enter number: ");
    scanf("%d", &n);
    for (int i = 1; i < n; i++) {
        if (n % i == 0) sum += i;
    }
    if (sum == n) printf("Perfect\n");
    else printf("Not Perfect\n");
}

// 7. Factorial
void factorial() {
    int n, fact = 1;
    printf("Enter number: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) fact *= i;
    printf("Factorial = %d\n", fact);
}

// 8. Strong number check
int factDigit(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) f *= i;
    return f;
}
void checkStrong() {
    int n, sum = 0, temp, digit;
    printf("Enter number: ");
    scanf("%d", &n);
    temp = n;
    while (temp > 0) {
        digit = temp % 10;
        sum += factDigit(digit);
        temp /= 10;
    }
    if (sum == n) printf("Strong\n");
    else printf("Not Strong\n");
}

// 9. Palindrome number
void checkPalindrome() {
    int n, rev = 0, temp;
    printf("Enter number: ");
    scanf("%d", &n);
    temp = n;
    while (temp > 0) {
        rev = rev*10 + temp%10;
        temp /= 10;
    }
    if (rev == n) printf("Palindrome\n");
    else printf("Not Palindrome\n");
}

// 10. Sum of first and last digit
void sumFirstLast() {
    int n, first, last;
    printf("Enter number: ");
    scanf("%d", &n);
    last = n % 10;
    while (n >= 10) {
        n /= 10;
    }
    first = n;
    printf("Sum = %d\n", first + last);
}

