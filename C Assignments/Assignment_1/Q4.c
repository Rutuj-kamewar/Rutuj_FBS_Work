//4. Write a program to check whether a given character is a vowel or consonant.

void main(){
		
	char a;
	printf("Give a charecter to check: ");
	scanf("%c",&a);
	
	if(a == 'a'||'e'||'i'||'o'||'u'||'A'||'E'||'I'||'O'||'U')
	{
		printf("%c is vowel",a);
	}
	else{
		printf("%c is consonant");
	}
}
