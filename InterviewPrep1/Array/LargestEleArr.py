n = 5
arr = [4, 5, 1, 2, 3]
largest = arr[0]

for i in range(len(arr)):
    if(largest<arr[i]):
        largest = arr[i]
        
print("The largest number is ",largest)
