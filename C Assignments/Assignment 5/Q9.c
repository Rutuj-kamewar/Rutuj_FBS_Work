//9. Print a hollow square pattern
//Input: n = 4
//Output:
//
//* * * *
//*     *
//*     *
//* * * *


int main() {
    int n = 5, i, j;

    for (i = 1; i <= n; i++) {      
        for (j = 1; j <= n; j++) {  
            if (j == 1 || i == 1 || j == n || i == n) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}
