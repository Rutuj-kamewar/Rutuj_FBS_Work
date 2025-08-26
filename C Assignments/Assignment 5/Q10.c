//10. Print a hollow square with diagonal pattern
//Input: n = 5
//Output:
//
//* * * * *
//* *     *
//*   *   *
//*     * *
//* * * * *

int main() {
    int n = 10, i, j;

    for (i = 1; i <= n; i++) {      
        for (j = 1; j <= n; j++) {  
            if (j == 1 || i == 1 || j == n || i == n||i==j) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
}