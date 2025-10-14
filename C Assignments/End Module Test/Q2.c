#include <string.h>

int check(char arr[], char c) {
    int count = 0;
    for (int i = 0; i < strlen(arr); i++) {
        if (arr[i] == c)
            count++;
    }
    return count;
}

void main() {
    char arr[] = "rare";

    for (int i = 0; i < strlen(arr); i++) {
        int alreadyPrinted = 0;

        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                alreadyPrinted = 1;
                break;
            }
        }

        if (!alreadyPrinted) {
            printf("%c = %d\n", arr[i], check(arr, arr[i]));
        }
    }
}
