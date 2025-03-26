def linear_search(arr,x):
 for i in range(len(arr)):
  if arr[i]==x:
   return i
 return -1

arr=[38,27,43,3,9,82,10]
x=43
result=linear_search(arr,x)
if result!=-1:
 print("Element found at index (Linear Search):",result)
else:
 print("Element not found (Linear Search)")