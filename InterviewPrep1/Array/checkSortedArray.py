nums = [3,4,5,1,2]
n = len(nums)
count = 0

for i in range(len(nums)-1):
    if(nums[i] > nums[i+1]):
        count += 1

if(count==0):
   print("True")
elif(count >1 ):
    print("FALSE")
elif(nums[0] >= nums[n-1]):
    print("True")
else:
    print("FALSE")

