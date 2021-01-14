n = int(input())
for i in range(1,n+1):
    arr = list(map(int, input().split()))
    val = int(round((sum(arr)/len(arr)), 0))
    print("#{} {}".format(i, val))