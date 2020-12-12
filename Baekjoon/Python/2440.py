n = int(input())
for i in range(n, -1, -1):
    ans = ""
    for j in range(i):
        ans += "*"
    print(ans)