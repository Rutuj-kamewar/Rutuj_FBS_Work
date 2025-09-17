//6. Accept array and print only prime numbers of array.

void main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in the array: ");
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int isPrime = 1;

        if (num < 2) {
            isPrime = 0;
        } else {
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }

        if (isPrime == 1) {
            printf("%d ", num);
        }
    }
}
