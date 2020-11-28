n = int(input())
arr = []
for i in range(n):
    val = int(input())
    if val != 0 :
        arr.append(val)
    else :
        arr.pop()
print(sum(arr))