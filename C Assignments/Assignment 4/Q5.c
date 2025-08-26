//5. Write a menu driven program to take a number for user and perform operations as follows.
//
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.
#include <stdio.h>

int main() {
    int choice = -1, num, i, rem, sum, rev, temp, isPrime;

    printf("Enter a number: ");
    scanf("%d", &num);

    while (choice != 0) {
        printf("\nMenu:\n");
        printf("1. Check Even or Odd\n");
        printf("2. Check Prime or Not\n");
        printf("3. Check Palindrome or Not\n");
        printf("4. Check Positive, Negative or Zero\n");
        printf("5. Reverse the Number\n");
        printf("6. Find Sum of Digits\n");
        printf("0. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {   // Even or Odd
            if (num % 2 == 0)
                printf("%d is Even\n", num);
            else
                printf("%d is Odd\n", num);
        }

        else if (choice == 2) {   // Prime check
            if (num <= 1) {
                printf("%d is not Prime\n", num);
            } else {
                isPrime = 1;
                for (i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = 0;
                        break;
                    }
                }
                if (isPrime == 1)
                    printf("%d is Prime\n", num);
                else
                    printf("%d is Not Prime\n", num);
            }
        }

        else if (choice == 3) {   // Palindrome
            temp = num;
            rev = 0;
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (rev == num)
                printf("%d is Palindrome\n", num);
            else
                printf("%d is Not Palindrome\n", num);
        }

        else if (choice == 4) {   // Positive / Negative / Zero
            if (num > 0)
                printf("%d is Positive\n", num);
            else if (num < 0)
                printf("%d is Negative\n", num);
            else
                printf("Number is Zero\n");
        }

        else if (choice == 5) {   // Reverse
            temp = num;
            rev = 0;
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            printf("Reversed Number = %d\n", rev);
        }

        else if (choice == 6) {   // Sum of digits
            temp = num;
            sum = 0;
            while (temp > 0) {
                rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            printf("Sum of digits = %d\n", sum);
        }

        else if (choice != 0) {
            printf("Invalid choice!\n");
        }

    }
}
