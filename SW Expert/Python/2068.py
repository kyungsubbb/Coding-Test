n = int(input())
arr = list()
for j in range(n):
    arr = list(map(int, input().split()))
    print("#{} {}".format(j+1,max(arr)))