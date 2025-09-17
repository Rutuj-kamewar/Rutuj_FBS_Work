//4. Find odd and even among the numbers.

void main() {
    int arr[5] = {10, 13, 14, 17, 20};

    printf("Even numbers: ");
    for (int i = 0; i < 5; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
        }
    }

    printf("\nOdd numbers: ");
    for (int i = 0; i < 5; i++) {
        if (arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
        }
    }
}
