def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        # Move elements of arr[0..i-1], that are greater than key, to one position ahead
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

# User Input
arr = list(map(int, input("Enter numbers to be sorted (space-separated): ").split()))

insertion_sort(arr)
print("Sorted array:", arr)
