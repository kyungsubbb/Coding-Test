n = int(input())
arr = list()
for j in range(n):
    sum = 0
    arr = list(map(int, input().split()))
    for i in arr:
        if i%2 == 1:
            sum += i
    print("#{} {}".format(j+1,sum))