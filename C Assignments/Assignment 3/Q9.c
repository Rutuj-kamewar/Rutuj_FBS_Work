//9 Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome

int main(){
	
	int n = 121;
	int rev = 0, rem, temp;
	temp = n;
	
	while(n>0){
		
		rem = n%10;
		rev = (rev*10) + rem;
		n = n/10;
			
	}
	temp == rev ? printf("Palindrome"): printf("Not Palindrome");
}