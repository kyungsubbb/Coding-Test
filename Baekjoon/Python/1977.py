a = int(input())
b = int(input())
arr = []
for i in range(a, b+1):
    if i**0.5 == int(i**0.5) :
        arr.append(i)
if len(arr) != 0 :
    print(sum(arr))
    print(min(arr))
else :
    print(-1)