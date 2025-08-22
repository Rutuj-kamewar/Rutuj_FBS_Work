//3 Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

int main(){
	
	int start = 1, end = 10, sum=0;
	
	while(start <= end){
		
		sum = start + sum;
		start++;
	}
	printf("%d",sum);
}