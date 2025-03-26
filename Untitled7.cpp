#include<stdio.h>
int main()
{
	int i,max,min;
	int arr[6]={29,90,78,54,87,38};
	max=min=arr[0];
	for(i=0;i<6;i++)
	{
		if(max<arr[i])
		max=arr[i];
	}
	for(i=0;i<6;i++)
	{
		if(min>arr[i])
		min=arr[i];
	}
	printf("The mx elment is %d",max);
	printf("the min is %d",min);
	return 0;
}
