arr = list(map(int, input().split()))
up = True
down = True

for i in range(1, len(arr)):
    if arr[i-1]<arr[i] :
        up = True
        down = False
    else :
        up = False
        down = True
if up:
    print("ascending")
elif down:
    print("descending")
else :
    print("mixed")