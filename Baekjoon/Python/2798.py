from itertools import combinations

num, val = map(int, input().split())
data = list(map(int, input().split()))

arr = []

for j in list(combinations(data,3)):
    arr.append(sum(j))

result = 0
for k in arr :
    if val >= k and result < k :
        result = k

print(result)

# 조합으로 푼 블랙잭 , 3회 중첩과 같은 결과임..
