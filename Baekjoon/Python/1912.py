n = int(input())
arr = list(map(int, input().split()))
val = arr[0]
max_val = arr[0]
for t in arr[1:]:
    if val <0 and t >0 :
        val = t
    else :
        val += t
    max_val = max(max_val, val, t)
print(max_val)