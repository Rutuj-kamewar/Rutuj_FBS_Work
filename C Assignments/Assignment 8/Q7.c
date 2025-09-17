//7. Take two array and add sum in third array

void main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];

    printf("Enter %d elements for first array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter %d elements for second array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
    }

    printf("Sum of two arrays:\n {");
    for (int i = 0; i < n; i++) {
        printf("%d,", sum[i]);
    }
    printf("}");
}
