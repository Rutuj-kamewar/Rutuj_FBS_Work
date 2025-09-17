//1. Find minimum and maximum number in array.

void main(){
	
	 int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int min =  arr[0], max = arr[0];
    
    for(int i =0;i<n; i++){
    	if(arr[i]<min){
    		min = arr[i];
		}
		if(arr[i]>max){
			max = arr[i];
		}
	}
	printf("Minimum = %d\n", min);
    printf("Maximum = %d\n", max);
}