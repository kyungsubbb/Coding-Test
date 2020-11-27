n = int(input())
arr = []
for i in range(n):
    arr.append(list(map(int,input().split())))
for i in range(1, n):
    leng = len(arr[i])
    for j in range(leng):
        if j == 0 :
            arr[i][j] += arr[i-1][j]
        elif j == i :
            arr[i][j] += arr[i-1][j-1]
        else :
            arr[i][j] += max(arr[i-1][j-1],arr[i-1][j])
print(max(arr[-1]))