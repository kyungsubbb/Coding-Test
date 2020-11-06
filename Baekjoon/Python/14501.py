N = int(input())

day = []
work = []
dp=[]
for i in range(N) :
    a, b = map(int, input().split())
    day.append(a)
    work.append(b)
    dp.append(b)
dp.append(0)
for j in range(len(dp)-2, -1, -1):
    if j + day[j] <= N :
        dp[j] = max(dp[j+1], work[j] + dp[j+day[j]])
    else :
        dp[j] = dp[j+1]
        
print(dp[0])