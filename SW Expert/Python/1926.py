n = int(input())
arr = [i for i in range(1, n+1)]
for i in arr :
    cnt = str(i).count("3")+str(i).count("6")+str(i).count("9")
    if cnt>0:
        for j in range(cnt):
            print("-",end="")
        print(end=" ")
    else :
        print(i, end=" ")