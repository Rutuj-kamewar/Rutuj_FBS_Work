//5. Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.


void main(){
	
	double price, total;
	char id;
	
	printf("What's the price: ");
	scanf("%lf",&price);
	printf("Are you a student(y/n): ");
	scanf(" %c",&id);
	
	if(id == 'y'){
		if(price > 500){
			total = price - (.20 * price) ;
		}
		else{
			total = price - (.10 * price);
		}
	}
	else{
		if(price > 600){
			total = price - (0.15 * price);
		}
	}
	
	printf("your final price after discount is: %0.2lf",total);
}