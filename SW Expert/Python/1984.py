n = int(input())
for test_case in range(1, n+1):
    arr = list(map(int, input().split()))
    arr.sort()
    print("#{} {}".format(test_case, round(sum(arr[1:-1])/(len(arr)-2))))