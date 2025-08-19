//5. Write a program to check whether a person is eligible to vote (age = 18).

void main(){
		
	int age;
	printf("Give a age to check: ");
	scanf("%d",&age);
	
	if(age >= 18){
		printf("you are %d and are Eligible to vote",age);
	}
	else{
		printf("you are %d and are not Eligible to vote ",age);
	}
	
}