N = int(input())
for i in range(N):
    a, b, c = list(map(int, input().split()))
    count = 0
    while True :
        count += 1
        if c-a <= 0 :
            break
        c -= a
    if count<10:
        print(str(c)+'0'+str(count))
    else :
        print(str(c)+str(count))