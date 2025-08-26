//2. Print prime numbers in the given range 1 to n.

int main() {
    int n, i, j, isPrime;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 2; i <= n; i++) {   
        isPrime = 1;            

        for (j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                isPrime = 0; 
                break;
            }
        }

        if (isPrime == 1) {
            printf("%d ", i);
        }
    }
}