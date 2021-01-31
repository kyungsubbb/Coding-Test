n = int(input())
arr = list(map(int, input().split()))
dp = [1] * len(arr)

for i in range(1,n):
    for j in range(i):
        if arr[i] > arr[j] :
            dp[i] = max(dp[i], dp[j]+1)
print(max(dp))


#dp문제는 점화식을 찾는것이 관건!