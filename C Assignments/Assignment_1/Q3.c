//3. Write a program to check whether a given year is a leap year.


void main(){
	
	int a;
	printf("Give a Year to check: ");
	scanf("%d",&a);
	if(a%4==0 && a%400 || a%100 != 0){
		printf("The given year is leap year");
	}
	else{
		printf("The given year is not a leap year");
	}
}