# from math import gcd
# n=int(input())
# arr = list()
# val = int(input())
# for _ in range(n-1):
#     a = int(input())
#     arr.append(a-val)
#     val = a
# if len(arr) == 1:
#     ans = arr[0]
# elif len(arr) > 1 :
#     arr.sort()
#     ans = gcd(arr[0], arr[1])
#     for i in range(2,len(arr)):
#         ans = gcd(ans, arr[i])
# for i in range(2, ans+1):
#     if ans%i == 0:
#         print(i, end = " ")
        

# 시간초과 -> 약수구하는 시간이 오래걸렸음

from math import gcd
n=int(input())
arr = list()
val = int(input())

for _ in range(n-1):
    a = int(input())
    arr.append(a-val)
    val = a
    
if len(arr) == 1:
    ans = arr[0]
elif len(arr) == 2 :
    ans = gcd(arr[0], arr[1])
elif len(arr) > 2 :
    ans = gcd(arr[0], arr[1])
    for i in range(2,len(arr)):
        ans = gcd(ans, arr[i])
        
div = list()
for i in range(1, int(ans**0.5)+1):
    if ans%i == 0 :
        div.append(i)
        if i != ans//i:
            div.append(ans//i)
div.sort()
for i in div:
    if i != 1:
        print(i, end=" ")