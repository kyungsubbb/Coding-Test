n = int(input())
lot = list(map(int, input().split()))
b, c = map(int, input().split())
cnt = 0
for i in range(len(lot)):
    lot[i] -= b
    cnt += 1
for i in lot :
    if i>0 :
        if i%c != 0 :
            cnt += i//c + 1
        else :
            cnt += i//c
print(cnt)