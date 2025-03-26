#include<stdio.h>
void swap(int x,int y){
	int temp;
	printf("the numbers before swapping: ");
	scanf("%d %d",&x,&y);
	temp=x;
	y=temp;
	printf("the number after swapping in function definition: x=%d, y=%d\n",x,y);
}
int main(){
	int a,b;
	printf("Enter the two numbers: ");
	scanf("%d %d", &a, &b);
	swap(a,b);
	printf("the numbers after swapping: a= %d, b=%d\n",a,b);
	return 0;
}
