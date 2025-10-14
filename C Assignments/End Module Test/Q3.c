#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char mName [50];
    int mId;
    int price;
    char brand[50];
} mobile;

mobile *mobiles = NULL;
int count = 0;

void addMobile(){
	mobiles = realloc(mobiles, (count+1) * sizeof(mobile));
	 printf("\nEnter mobile  Name: ");
    scanf(" %s", mobiles[count].mName);
    printf("Enter mobile ID: ");
    scanf("%d", &mobiles[count].mId);
    printf("Enter price: ");
    scanf("%d", &mobiles[count].price);
    printf("Enter brand: ");
    scanf("%s", mobiles[count].brand);

    count++;
}
void displayMobiles(){
	for (int i = 0; i < count; i++) {
        printf("\nMobile Name: %s", mobiles[i].mName);
        printf("\nMobiole ID: %d", mobiles[i].mId);
        printf("\nPrice: %d", mobiles[i].price);
        printf("\nBrand: %s\n", mobiles[i].brand);
    }
}

void main() {
    int choice;
     
    while (1) {
        printf("1. Add Mobile\n");
        printf("2. Display Mobiles\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1)
            addMobile();
        else if (choice == 2)
            displayMobiles(); 
		else
            printf("\nInvalid choice! Try again.\n");
    }
}

