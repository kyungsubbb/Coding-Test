n = int(input())

arr = list(map(int, input().split()))

clone = arr

clone.sort()

sum = 0

for i in range(len(clone)):
    for j in range(0,i+1):
        sum += clone[j]

print(sum)