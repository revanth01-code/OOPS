#include<stdio.h>
int main(){
	int a,b,temp;
	printf("Enter hte numbers: ");
	scanf("%d %d",&a,&b);
	temp=a;
	a=b;
	b=temp;
	printf("the number after swapping is %d %d\n",a,b);
	return 0;
}
