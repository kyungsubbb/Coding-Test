N = int(input())
def count(n):
    arr = [0 for i in range(n+1)]
    if n<= 1:
        return n
    else :
        arr[1] = 1
        arr[2] = 2
        for i in range(3,n+1):
            arr[i] = (arr[i-1] + arr[i-2])%15746
    return arr[n]
print(count(N))