#include<stdio.h>
int main()
{
	int arr[3],i;
	printf("Enter array elements:\n");
	for(i=0;i<3;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Entered array elements are:\n");
	for(i=0;i<3;i++)
	{
		printf("%d\n",arr[i]);
	}
	return 0;
}
