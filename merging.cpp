#include<stdio.h>
int main()
{
 int arr1[10],arr2[10],arr3[20];
 int i,n1,n2,m,index=0;
 printf("Enter the no.of elements in 1st array:\n");
 scanf("%d",&n1);
 for(i=0;i<n1;i++)
 {
 	printf("\ arr1[%d]= ",i);
 	scanf("%d", &arr1[i]);
 }
 printf("Enter the no.of elements in 2nd array:\n");
 scanf("%d",&n2);
 for(i=0;i<n2;i++)
 {
 	printf("\ arr2[%d]= ",i);
 	scanf("%d", &arr2[i]);
 }
 m=n1+n2;
 for(i=0;i<n1;i++)
 {
 	arr3[index] =arr1[i];
 	index++;
 }
 for(i=0;i<n2;i++)
 {
 	arr3[index] =arr2[i];
 	index++;
 }
 printf("\n\n The merged array is");
 for(i=0;i<m;i++){printf("\n arr[%d]=%d ",i,arr3[i]);
 }
 return 0;
}
