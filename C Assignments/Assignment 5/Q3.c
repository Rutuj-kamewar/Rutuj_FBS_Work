//3. Print an inverted right-angled triangle pattern
//Input: n = 5
//Output:
//
//*****
//****
//***
//**
//*
int main() {
    int n=5, i, j;


    for (i = n; i >= 1; i--) {        
        for (j = 1; j <= i; j++) { 
            printf("*");
        }
        printf("\n");
    }
}
