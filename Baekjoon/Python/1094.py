bar = [64, 32, 16, 8, 4, 2, 1, 1]
cnt = 0
n = int(input())
for i in bar :
    if n >= i :
        cnt += 1
        n -= i
print(cnt)