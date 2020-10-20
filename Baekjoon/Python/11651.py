N = int(input())
arr = []

for i in range(N) :
    a = list(map(int,input().split()))
    arr.append([a[1], a[0]] )

arr.sort()

for i in range(N):
    print(arr[i][1],arr[i][0])