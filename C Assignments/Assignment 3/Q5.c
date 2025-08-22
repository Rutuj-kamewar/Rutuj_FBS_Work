//5 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong

int main(){
	
	int n = 153, rem, sum =0;
	int temp;
	temp = n; 
	
	while(n>0){
		
		rem = n%10;
		sum = sum + (rem*rem*rem);
		n = n/10;
	}
	temp==sum ? printf("Armstrong"): printf("Not Armstrong");
}