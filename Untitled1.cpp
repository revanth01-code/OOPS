#include<stdio.h>
int main()
{
	int a=10,b=5;
	printf("Enter the two numbers: ");
	scanf("%d %d",&a,&b);
	a=a+b;
	b=b-a;
	a=a-b;
	printf("The number after swapping %d/n",a,b);
	return 0;
}
