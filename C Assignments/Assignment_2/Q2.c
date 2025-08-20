//2. Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

void main(){
	
	double a, b, c;
	printf("Lenght of first side: ");
	scanf("%f",&a);
	printf("Lenght of second side: ");
	scanf("%f",&b);
	printf("Lenght of third side: ");
	scanf("%f",&c);
	
	if(a==b && b==c && a==c ){
		printf("The given triangle is equilateral triangle ");
	}
	else if(a == b && b != c){
			printf("The given triangle is isosceles triangle ");
	}
	else{
			printf("The given triangle is scalene triangle ");
	}
}