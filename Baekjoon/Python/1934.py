from math import gcd
n = int(input())
for i in range(n):
    a,b = map(int, input().split())
    g = gcd(a,b)
    a = a//g
    b = b//g
    print(g*a*b)