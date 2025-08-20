//1. Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.

void main(){
	
	int a, b;
	char sign;
	printf("What operation would you like to perform(+,-,/,*,%): ");
	scanf("%c",&sign);
	printf("Give two Numbers to %c: ",sign);
	scanf("%d %d",&a,&b);
	
	if(sign == '+'){
		printf("The Addition is: %d",a+b);
	}
	else if(sign == '-'){
		printf("The Sub is: %d",a-b);
	}
	else if(sign == '*'){
		printf("The multiplication is: %d",a*b);
	}
	else if(sign == '%'){
		printf("The Reminder of division is: %d",a%b);
	}
	else{
		printf("The Division is: %d",a/b);
	}	
}