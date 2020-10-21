from math import gcd

N = int(input())

a,b = 0, 0

arr = list(map(int, input().split()))

for i in range(1, len(arr)):
    maxi = gcd(arr[0], arr[i])
    a = arr[0] // maxi
    b = arr[i] // maxi
    print(str(int(a))+'/'+str(b))
   
        