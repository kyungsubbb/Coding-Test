from math import gcd 
n = int(input())
cnt = 0
for i in range(1, n+1):
    if gcd(n, i) == 1:
        cnt += 1
print(cnt)

# 아직 성공 못함.. 201214