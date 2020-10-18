def count(n):
    arr = [1 for i in range(n+1)]
    if n<= 1:
        return n
    else :
        for i in range(4,n+1):
            arr[i] = arr[i-2] + arr[i-3]
    return arr[n]

N = int(input())
for i in range(N):
    k = int(input())
    print(count(k))