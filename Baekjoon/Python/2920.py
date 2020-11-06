arr = list(map(int, input().split()))
asc = sorted(arr)
des = sorted(arr, reverse = True)
if arr == asc :
    print("ascending")
elif arr == des :
    print("descending")
else :
    print("mixed")