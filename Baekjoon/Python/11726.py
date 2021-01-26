n = int(input())
arr = [1]*(n+1)
for i in range(2,len(arr)):
    arr[i] = arr[i-1] + arr[i-2]

print(arr[n]%10007)