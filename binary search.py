def binary_search(arr,x):
 left=0
 right=len(arr)-1
 while left<=right:
  mid=left+(right-left)//2
  if arr[mid]==x:
 return mid
  elif arr[mid]<x:
   left=mid+1
  else:
   right=mid-1
 return -1

arr=[3,9,10,27,38,43,82]
x=43
result=binary_search(arr,x)
if result!=-1:
 print("Element found at index (Binary Search):",result)
else:
 print("Element not found (Binary Search)")