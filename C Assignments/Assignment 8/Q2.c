//2. Search the given number in array.

void main(){
	
    int arr[5] ={10,12,14,15,17};

    int n;
    printf("Enter the no. You want to serch in array");
    scanf("%d",&n);
    
    int found = 0;
    for(int i =0;i<6; i++){
    	if(arr[i]==n){
    		printf("the No. is found at %d",i);
    		found = 1;
    		break;			
		}
	}
	 if (found == 0) {
        printf("The number %d is not found in the array\n", n);
    }
}