//4 Check the given number is prime or not.
//Input: n = 7
//Output: Prime


int main(){
	
	int n = 12 , i = 2;
	int flag = 1;
	
	while(i<n){
		
		if(n%i == 0){
			flag = 0;
			break;
		}		
		i++;
	}
    flag ? printf("prime") : printf("not prime");
}