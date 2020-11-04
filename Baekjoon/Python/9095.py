N = int(input())
arr = [0, 1, 2, 4, 7, 0, 0, 0, 0, 0 ,0]
for j in range(5, len(arr)):
        arr[j] = arr[j-1]+ arr[j-2]+ arr[j-3]
for i in range(N):
    a = int(input())
    print(arr[a])