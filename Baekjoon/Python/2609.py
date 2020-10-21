from math import gcd
a, b = list(map(int, input().split()))
maxi = gcd(a,b)
a //= maxi
b //= maxi
print(maxi)
print(a*b*maxi)