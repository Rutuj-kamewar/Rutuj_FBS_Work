
int main() {
    int n, num, rem, digits, sum, i, temp,power;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        num = i;
        temp = num;
        digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            power = 1;
            for (int j = 0; j < digits; j++) {
                power *= rem;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == num) {
            printf("%d ", num);
        }
    }

    return 0;
}
