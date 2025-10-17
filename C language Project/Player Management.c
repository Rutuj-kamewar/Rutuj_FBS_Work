#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char name[50];
    int jerseyNo;
    int runs;
    int wickets;
} Player;

// Global pointer
Player *players = NULL;
int count = 0;


// Function to add a player
void addPlayer() {
    players = realloc(players, (count + 1) * sizeof(Player));

    printf("\nEnter Player Name: ");
    scanf(" %[^\n]", players[count].name);
    printf("Enter Jersey Number: ");
    scanf("%d", &players[count].jerseyNo);
    printf("Enter Runs: ");
    scanf("%d", &players[count].runs);
    printf("Enter Wickets: ");
    scanf("%d", &players[count].wickets);

    count++;
    printf("\nPlayer added successfully!\n");
}

// Function to display all players
void displayPlayers() {

    printf("\n--- Player List ---\n");
    for (int i = 0; i < count; i++) {
        printf("\nName: %s", players[i].name);
        printf("\nJersey No: %d", players[i].jerseyNo);
        printf("\nRuns: %d", players[i].runs);
        printf("\nWickets: %d\n", players[i].wickets);
    }
}

//Search by Jersey Number
void searchByJersey() {
    int jersey;
    printf("Enter Jersey Number to search: ");
    scanf("%d", &jersey);

    for (int i = 0; i < count; i++) {
        if (players[i].jerseyNo == jersey) {
            printf("\nPlayer Found:\nName: %s\nRuns: %d\nWickets: %d\n",
                   players[i].name, players[i].runs, players[i].wickets);
            return;
        }
    }
    printf("\nPlayer not found!\n");
}

//Search by Name
void toLowerCase(char str[]) {
    for (int i = 0; str[i]; i++)
        str[i] = tolower(str[i]);
}

void searchByName() {
    char keyword[50], tempName[50], tempKeyword[50];
    printf("Enter name or part of name: ");
    scanf(" %[^\n]", keyword);

    strcpy(tempKeyword, keyword);
    toLowerCase(tempKeyword); 

    int found = 0;
    for (int i = 0; i < count; i++) {
        strcpy(tempName, players[i].name);
        toLowerCase(tempName);
        
        if (strstr(tempName, tempKeyword)) {
            printf("\nJersey No: %d\nName: %s\nRuns: %d\nWickets: %d\n",
                   players[i].jerseyNo, players[i].name, players[i].runs, players[i].wickets);
            found = 1;
        }
    }

    if (!found)
        printf("\nPlayer not found!\n");
}

// Function to search a player
void searchPlayer() {

    int choice;
    printf("\nSearch by:\n1. Jersey Number\n2. Name\nEnter choice: ");
    scanf("%d", &choice);

    if (choice == 1)
        searchByJersey();
    else if (choice == 2)
        searchByName();
    else
        printf("\nInvalid choice!\n");
}


// Function to update player info
void updatePlayer() {

    int jersey;
    printf("\nEnter Jersey Number to Update: ");
    scanf("%d", &jersey);

    for (int i = 0; i < count; i++) {
    	int newRuns = 0, newWickets = 0;
        if (players[i].jerseyNo == jersey) {
            printf("\nEnter New Runs: ");
            scanf("%d", &newRuns);
            players[i].runs = players[i].runs + newRuns;
            printf("Enter New Wickets: ");
            scanf("%d", &newWickets);
            players[i].wickets = players[i].wickets + newWickets;
            printf("Player updated successfully!\n");
            return;
        }
    }
    printf("\nPlayer not found!\n");
}

// Function to remove a player
void removePlayer() {

    int jersey, index = -1;
    printf("\nEnter Jersey Number to Remove: ");
    scanf("%d", &jersey);

    for (int i = 0; i < count; i++) {
        if (players[i].jerseyNo == jersey) {
            index = i;
            break;
        }
    }

    if (index == -1) {
        printf("\nPlayer not found!\n");
        return;
    }

    for (int i = index; i < count - 1; i++) {
        players[i] = players[i + 1];
    }

    count--;
    players = realloc(players, count * sizeof(Player));
    printf("\nPlayer removed successfully!\n");
}

// Function to show top 3 by runs
void top3ByRuns() {

    Player temp;
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (players[j].runs < players[j + 1].runs) {
                temp = players[j];
                players[j] = players[j + 1];
                players[j + 1] = temp;
            }
        }
    }

    printf("\n--- Top 3 Players by Runs ---\n");
    for (int i = 0; i < 3; i++) {
        printf("%d. %s - Runs: %d, Wickets: %d\n",
               i + 1, players[i].name, players[i].runs, players[i].wickets);
    }
}

void top3ByWickets() {

     Player temp;
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (players[j].wickets < players[j + 1].wickets) {
                temp = players[j];
                players[j] = players[j + 1];
                players[j + 1] = temp;
            }
        }
    }

    printf("\n--- Top 3 Players by Wickets ---\n");
    for (int i = 0; i < 3; i++) {
        printf("%d. %s - Wickets: %d, Runs: %d\n",
               i + 1, players[i].name, players[i].wickets, players[i].runs);
    }
}

//function to sort by Runs
void sortPlayersByRuns() {

    Player temp;
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (players[j].runs < players[j + 1].runs) {
                temp = players[j];
                players[j] = players[j + 1];
                players[j + 1] = temp;
            }
        }
    }
    displayPlayers();
}

//Function to sort by Wickets
void sortPlayersByWickets() {

    Player temp;
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (players[j].wickets < players[j + 1].wickets) {
                temp = players[j];
                players[j] = players[j + 1];
                players[j + 1] = temp;
            }
        }
    }
    displayPlayers();
}


//function to sort
void sortAndDisplayPlayers() {

    int choice;
    printf("\nSort players by:\n1. Runs\n2. Wickets\nEnter choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
    	printf("\nPlayers sorted by Runs:\n");
        sortPlayersByRuns(); // sort by runs
    }
    else if (choice == 2) {
        printf("\nPlayers sorted by Wickets:\n");
        sortPlayersByWickets(); // sort by wickets
    }
    else {
        printf("\nInvalid choice!\n");
    }
}



void loadSamplePlayers() {
    players = malloc(10 * sizeof(Player));
    if (players == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }

    count = 10;

    strcpy(players[0].name, "Virat Kohli");
    players[0].jerseyNo = 18;
    players[0].runs = 12500;
    players[0].wickets = 4;

    strcpy(players[1].name, "Rohit Sharma");
    players[1].jerseyNo = 45;
    players[1].runs = 10500;
    players[1].wickets = 8;

    strcpy(players[2].name, "MS Dhoni");
    players[2].jerseyNo = 7;
    players[2].runs = 10773;
    players[2].wickets = 1;

    strcpy(players[3].name, "Yuvraj Singh");
    players[3].jerseyNo = 12;
    players[3].runs = 8701;
    players[3].wickets = 111;

    strcpy(players[4].name, "Jasprit Bumrah");
    players[4].jerseyNo = 99;
    players[4].runs = 120;
    players[4].wickets = 200;

    strcpy(players[5].name, "Sachin Tendulkar");
    players[5].jerseyNo = 10;
    players[5].runs = 18426;
    players[5].wickets = 154;

    strcpy(players[6].name, "Ravindra Jadeja");
    players[6].jerseyNo = 77;
    players[6].runs = 2750;
    players[6].wickets = 198;

    strcpy(players[7].name, "Hardik Pandya");
    players[7].jerseyNo = 33;
    players[7].runs = 1750;
    players[7].wickets = 70;

    strcpy(players[8].name, "Suryakumar Yadav");
    players[8].jerseyNo = 63;
    players[8].runs = 1200;
    players[8].wickets = 0;

    strcpy(players[9].name, "KL Rahul");
    players[9].jerseyNo = 25;
    players[9].runs = 2500;
    players[9].wickets = 0;

    printf("\n10 Sample players loaded successfully!\n");
}



// Main function
void main() {
    int choice;
    
     loadSamplePlayers(); 
     
    while (1) {
        printf("\n\n--- Cricket Player Management ---\n");
        printf("1. Add Player\n");
        printf("2. Display Players\n");
        printf("3. Search Player\n");
        printf("4. Update Player\n");
        printf("5. Remove Player\n");
        printf("6. Top 3 Players by Runs\n");
        printf("7. Top 3 Players by Wickets\n");
        printf("8. Sort Players \n");
        printf("9. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1)
            addPlayer();
        else if (choice == 2)
            displayPlayers();
        else if (choice == 3)
            searchPlayer();
        else if (choice == 4)
            updatePlayer();
        else if (choice == 5)
            removePlayer();
        else if (choice == 6)
            top3ByRuns();
        else if (choice == 7)
            top3ByWickets();
        else if (choice == 8)
            sortAndDisplayPlayers(); 
        else if (choice == 9) {
            printf("\nExiting... Thank you!\n");
            break;
        } else
            printf("\nInvalid choice! Try again.\n");
    }
}
