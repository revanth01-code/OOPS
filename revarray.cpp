#include<stdio.h>
int main()
{
	int i,n,rev[5];
	n=5;
	int arr[5]={45,67,90,78,89};
	for(i=0;i<n;i++)
	{
		rev[i]=arr[n-i-1];
	}
	for(i=0;i<n;i++)
	{
		printf("%d\n",rev[i]);
	}
	return 0;
}
