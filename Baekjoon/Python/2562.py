maxi = 0
count = 0
for i in range(9):
    a = int(input())
    if a > maxi :
        maxi = a
        count = i
print(maxi)
print(count+1)