//6. Write a program to check whether a given character is uppercase or lowercase.

void main(){
	
	char a;
	printf("Give a charecter to check: ");
	scanf("%c",&a);
	
	if(a < 97){
		printf("the character is in UPPERCASE");
	}
	else{
		printf("THE CHARACTER IS IN lowercase");
	}
}