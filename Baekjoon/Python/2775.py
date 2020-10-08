N = int(input())
count = 0
for i in range(N):
    a = int(input())
    b = int(input())
    start = [i for i in range(1,15)]
    for k in range(a):
        for j in range(1,len(start)) :
            start[j] = start[j]+start[j-1]
    print(start[b-1])