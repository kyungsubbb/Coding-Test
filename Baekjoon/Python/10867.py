n = int(input())
data = list(map(int, input().split()))
arr = set()
for i in data :
    arr.add(i)
data = []
for k in arr:
    data.append(k)
data.sort()
for j in data :
    print(j, end=" ")