a = int(input())
for j in range(a):
    N = int(input())
    arr = []
    dic = dict()
    val = 1
    
    for i in range(N):
        a,b = input().split()
        if b not in dic :
            dic[b] =[a]
        else :
            dic[b].append(a)

    for k,v in dic.items() :
        arr.append(len(v))

    
    for k in arr :
        val *= k+1

    print(val-1)