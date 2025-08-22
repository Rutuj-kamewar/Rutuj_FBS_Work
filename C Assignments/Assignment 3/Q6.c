//6 Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

int main(){
	
	int n = 28;
	int i = 1,num= 0;
	
	while(n>i){
		
		if(n%i==0){
			num = num + i;
		}		
		i++;
	}
	
	n == num ? printf("perfect"): printf("not perfect");
}