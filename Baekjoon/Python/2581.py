start = int(input())
finish = int(input())
arr = []
a = False
for i in range(start, finish+1):
    a = False
    if i == 1 :
        continue
    elif i == 2 :
        arr.append(2)
    else :
        for j in range(2, i):
            if i/j == int(i/j) :
                a = False
                break
            else :
                a = True
                continue
        if a == True :
            arr.append(i)
if len(arr) > 0 :
    print(sum(arr))
    print(min(arr))
else :
    print(-1)