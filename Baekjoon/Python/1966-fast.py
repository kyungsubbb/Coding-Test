n = int(input())
for i in range(n):
    cnt, ind = map(int,input().split())
    qu = list(map(int,input().split()))
    qu = [(val, idx) for idx, val in enumerate(qu)]
    
    count = 0
    while True :
        if qu[0][0] == max(qu, key=lambda x : x[0])[0] :
            count += 1
            if qu[0][1] == ind :
                print(count)
                break
            else :
                qu.pop(0)
        else :
            qu.append(qu.pop(0))

# 이게 하인가.... 흠...
