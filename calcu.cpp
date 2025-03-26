#include<stdio.h>
int main(){
	int a,b,c;
	printf("enter two numbers:");
	scanf("%d %d",&a,&b);
	c=a+b;
	printf("The sum of the numbers is %d",c);
	c=a-b;
	printf("The difference of the numbers is %d\n",c);
	c=a/b;
	printf("The divison of the two numbers is %f\n",c);
	c=a*b;
	printf("The multiplication of the two numbers is %d\n",c);
	c=a*a;
	printf("the square of the number is %d\n",c);
	c=a*a*a;
	printf("the cube of the number is %d\n",c);
	
	return 0;
	
}
