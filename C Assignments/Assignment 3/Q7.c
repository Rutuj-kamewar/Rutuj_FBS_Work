//7 Find factorial of given number.
//Input: n = 5
//Output: 120

int main(){
	
	int n = 5;
	int i = 1 , fac = 1;
	
	
	while(n>=i){
		
		fac = fac*i;	
	i++;	
	}
	printf("%d",fac);
}