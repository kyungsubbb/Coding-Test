n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))
for i in range(n):
    min_idx = i
    for j in range(i+1, len(arr)):
        if arr[j]<arr[min_idx] :
            min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
for i in arr:
    print(i)
# n^2 으로 해결