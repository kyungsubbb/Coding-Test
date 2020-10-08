count = int(input())
for i in range(count) :
    a= 0
    arr = list(map(int,input().split()))
    mid = sum(arr[1:])/arr[0]
    for i in range(1,len(arr)):
        if arr[i]>mid :
            a +=1
    print("%.3f" %(a/arr[0]*100)+'%')