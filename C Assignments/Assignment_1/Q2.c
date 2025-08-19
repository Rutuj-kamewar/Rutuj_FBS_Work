//2. Write a program to check given 3 digit number is pallindrome or not.

void main(){
	int a;
	printf("Give a Number to check: ");
	scanf("%d",&a);
	int d1,d2,d3,q,rev;
	d3 = a%10;
	q =  a/10;
	d2 = q%10;
	d1 = a/100;	
	rev = (d3*100)+(d2*10)+(d1);
	
	if(a == rev){
		printf("Number is palindrome");
	}
	else{
		printf("Number is not palindrome");
	}
}