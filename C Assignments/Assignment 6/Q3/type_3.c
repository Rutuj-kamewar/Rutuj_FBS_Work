//type 3
void print1to10();
void printTable(int n);
void sumRange(int start, int end);
void checkPrime(int n);
void checkArmstrong(int n);
void checkPerfect(int n);
void factorial(int n);
void checkStrong(int n);
void checkPalindrome(int n);
void sumFirstLast(int n);

// Menu
void main() {
    int choice;
    printf("1. Print numbers from 1 to 10\n");
    printf("2. Print table for a number\n");
    printf("3. Sum of numbers in range\n");
    printf("4. Check Prime\n");
    printf("5. Check Armstrong\n");
    printf("6. Check Perfect\n");
    printf("7. Factorial\n");
    printf("8. Check Strong\n");
    printf("9. Check Palindrome\n");
    printf("10. Sum of First and Last Digit\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        print1to10();
    }
    else if (choice == 2) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        printTable(n);
    }
    else if (choice == 3) {
        int start, end;
        printf("Enter start and end: ");
        scanf("%d %d", &start, &end);
        sumRange(start, end);
    }
    else if (choice == 4) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        checkPrime(n);
    }
    else if (choice == 5) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        checkArmstrong(n);
    }
    else if (choice == 6) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        checkPerfect(n);
    }
    else if (choice == 7) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        factorial(n);
    }
    else if (choice == 8) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        checkStrong(n);
    }
    else if (choice == 9) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        checkPalindrome(n);
    }
    else if (choice == 10) {
        int n;
        printf("Enter number: ");
        scanf("%d", &n);
        sumFirstLast(n);
    }
    else {
        printf("Invalid choice!\n");
    }
}

//Functions

// 1. Print numbers from 1 to 10
void print1to10() {
    for (int i = 1; i <= 10; i++)
        printf("%d ", i);
    printf("\n");
}

// 2. Print table
void printTable(int n) {
    for (int i = 1; i <= 10; i++)
        printf("%d ", n * i);
    printf("\n");
}

// 3. Sum of range
void sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) sum += i;
    printf("Sum = %d\n", sum);
}

// 4. Prime check
void checkPrime(int n) {
    int flag = 1;
    if (n <= 1) flag = 0;
    else {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) { flag = 0; break; }
        }
    }
    if (flag) printf("Prime\n");
    else printf("Not Prime\n");
}

// 5. Armstrong
void checkArmstrong(int n) {
    int temp = n, digit, sum = 0;
    while (temp > 0) {
        digit = temp % 10;
        sum += digit*digit*digit;
        temp /= 10;
    }
    if (sum == n) printf("Armstrong\n");
    else printf("Not Armstrong\n");
}

// 6. Perfect
void checkPerfect(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++)
        if (n % i == 0) sum += i;
    if (sum == n) printf("Perfect\n");
    else printf("Not Perfect\n");
}

// 7. Factorial
void factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) fact *= i;
    printf("Factorial = %d\n", fact);
}

// 8. Strong
void checkStrong(int n) {
    int temp = n, digit, sum = 0;
    while (temp > 0) {
        digit = temp % 10;
        int f = 1;
        for (int i = 1; i <= digit; i++)
		    f *= i;
        sum += f;
        temp /= 10;
    }
    if (sum == n) printf("Strong\n");
    else printf("Not Strong\n");
}

// 9. Palindrome
void checkPalindrome(int n) {
    int temp = n, rev = 0, digit;
    while (temp > 0) {
        digit = temp % 10;
        rev = rev * 10 + digit;
        temp /= 10;
    }
    if (rev == n) printf("Palindrome\n");
    else printf("Not Palindrome\n");
}

// 10. Sum of first and last digit
void sumFirstLast(int n) {
    int last = n % 10, first;
    while (n >= 10) n /= 10;
    first = n;
    printf("Sum of first and last digit = %d\n", first + last);
}
