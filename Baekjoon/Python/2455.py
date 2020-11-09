arr = []
answer = 0
for i in range(4):
    a, b = map(int, input().split())
    answer = answer-a+b
    arr.append(answer)
print(max(arr))