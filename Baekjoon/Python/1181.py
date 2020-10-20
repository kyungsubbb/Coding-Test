N = int(input())

arr = []

for i in range(N):
    arr.append(input())
arr = set(arr)
b = sorted(arr)
b.sort(key=len)

for i in b:
    print(i)