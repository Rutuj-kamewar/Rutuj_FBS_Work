//1. Print a solid square pattern
//Input: n = 4
//Output:
//
//* * * *
//* * * *
//* * * *
//* * * *
int main() {
    int n = 4, i, j;

    for (i = 1; i <= n; i++) {      
        for (j = 1; j <= n; j++) {     
            printf("* ");
        }
        printf("\n");
    }

}
