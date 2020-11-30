def ma(data) :
    ans= []
    for i in range(len(data)):
        res = []
        for j in range(len(data[i:])):
            ans.append(sum(data[i:i+j]))
    return max(ans)

n = int(input())
arr = list(map(int, input().split()))
print(ma(arr))