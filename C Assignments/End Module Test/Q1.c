int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}
void main(){
	int n = 10;
	for(int i=0; i<n; i++){
		printf("%d ",factorial(i)  );
	}
}