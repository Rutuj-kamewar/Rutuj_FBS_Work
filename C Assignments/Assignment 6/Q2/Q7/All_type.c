// Type 1

void ageGroup1() {
    int age;
    printf("Enter age: ");
    scanf("%d", &age);

    if (age < 12) printf("Child\n");
    else if (age <= 19) printf("Teenager\n");
    else if (age <= 59) printf("Adult\n");
    else printf("Senior\n");
}

// Type 2
int ageGroup2() {
    int age;
    printf("Enter age: ");
    scanf("%d", &age);

    if (age < 12) return 1;
    else if (age <= 19) return 2;
    else if (age <= 59) return 3;
    else return 4;
}

// Type 3

void ageGroup3(int age) {
    if (age < 12) printf("Child\n");
    else if (age <= 19) printf("Teenager\n");
    else if (age <= 59) printf("Adult\n");
    else printf("Senior\n");
}

// Type 4

int ageGroup4(int age) {
    if (age < 12) return 1;
    else if (age <= 19) return 2;
    else if (age <= 59) return 3;
    else return 4;
}

//MENU

 void main() {
    int tChoice;
    printf("Choose Function Type:\n");
    printf("1. Type 1 \n");
    printf("2. Type 2 \n");
    printf("3. Type 3 \n");
    printf("4. Type 4 \n");
    printf("Enter choice: ");
    scanf("%d", &tChoice);

    if (tChoice == 1) {
        ageGroup1();
    }
    else if (tChoice == 2) {
        int result = ageGroup2();
        if (result == 1) printf("Child\n");
        else if (result == 2) printf("Teenager\n");
        else if (result == 3) printf("Adult\n");
        else printf("Senior\n");
    }
    else if (tChoice == 3) {
        int age;
        printf("Enter age: ");
        scanf("%d", &age);
        ageGroup3(age);
    }
    else if (tChoice == 4) {
        int age;
        printf("Enter age: ");
        scanf("%d", &age);
        int result = ageGroup4(age);
        if (result == 1) printf("Child\n");
        else if (result == 2) printf("Teenager\n");
        else if (result == 3) printf("Adult\n");
        else printf("Senior\n");
    }
    else {
        printf("Invalid choice!\n");
    }
}
