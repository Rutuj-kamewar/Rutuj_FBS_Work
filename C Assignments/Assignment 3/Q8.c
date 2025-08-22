//8 Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

int main(){
	
	int n = 145;
	int digit, sum = 0, rem, temp, fac, i;
	temp = n;
	
	while(temp > 0){
		
		rem = temp%10;
		
		fac = 1;   //declared here so it can reset for each digit
		i = 1;     // same for i
		while(i <= rem){
		     fac = fac*i;	
	         i++;	
	    }
	    
	    sum = sum + fac;
	    temp = temp/10;
	}
	
	if (sum == n)
        printf("Strong");
    else
        printf("Not Strong");

}