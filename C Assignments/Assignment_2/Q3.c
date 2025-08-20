//3. Write a program to find greatest of three numbers using nested if-else.

void main(){
	
	int a, b, c;
	printf("First Number: ");
	scanf("%d",&a);
	printf("second Number: ");
	scanf("%d",&b);
	printf("third Number: ");
	scanf("%d",&c);
	
	if(a > b){
		if(a > c){
			printf("%d is the greatest number",a);
		}
		else {
			printf("%d is the greatest number",c);
		}
	}
	else if(b > a){
		if(b > c){
			printf("%d is the greatest number",b);
		}
		else {
			printf("%d is the greatest number",c);
		}
	}
}
	