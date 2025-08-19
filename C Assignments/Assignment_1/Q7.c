//7. Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.

void main(){
	
    float basic, da, ta, hra, total;

    printf("Enter your starting salary: ");
    scanf("%f", &basic);

    if (basic <= 5000) {
        da = (10.0/100) * basic;
        ta = (20.0/100) * basic;
        hra = (25.0/100) * basic;
    } else {
        da = (15.0/100) * basic;
        ta = (25.0/100) * basic;
        hra = (30.0/100) * basic;
    }

    total = basic + da + ta + hra;

    printf("\nBasic Salary: %f", basic);
    printf(" and DA: %f", da);
    printf(" and TA: %f", ta);
    printf(" and HRA: %f", hra);
    printf(" and Total Salary: %f", total);

}