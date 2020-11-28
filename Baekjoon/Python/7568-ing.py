n = int(input())
arr = []
for i in range(n):
    arr.append(list(map(int,input().split())))
rank = 1
cnt = 0
sol = [0]*len(arr)

for i in range(n):
    idx = arr.index(max(arr))
    val = arr[idx]
    sol[idx] = rank
    arr[idx] = [0,0]
    if val[0] > arr[arr.index(max(arr))][0] and val[1] > arr[arr.index(max(arr))][1]:
        rank += 1+cnt
        cnt = 0
    else :
        cnt += 1
for i in sol:
    print(i, end=" ")
    

'''
뭐가문제인가....흠 20201128
'''