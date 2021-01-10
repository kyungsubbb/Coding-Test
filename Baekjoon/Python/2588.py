a = int(input())
b = int(input())
res = a*b
while b>=1 :
    print(a*(b%10))
    b //= 10
print(res)