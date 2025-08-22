//10 Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)


int main(){
	
	int n = 12345;
	int rev = 0, rem, temp;
	temp = n;
	
	while(n>0){
		
		rem = n%10;
		rev = (rev*10) + rem;
		n = n/10;	
	}
	 
	 int first = 0, last = 0;
	 last = temp%10;
	 first = rev%10;
	 
	 printf("output: %d",first+last);
	 
}