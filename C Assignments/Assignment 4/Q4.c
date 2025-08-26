int main() {
    int n, i, num, rem, sum, temp, j, fact;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        num = i;
        temp = num;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            
            fact = 1;
            for (j = 1; j <= rem; j++) {
                fact *= j;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            printf("%d ", num);
        }
    }
}