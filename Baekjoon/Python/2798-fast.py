num, val = map(int, input().split())
data = list(map(int, input().split()))
sum_val = 0
for i in range(len(data)):
    for j in range(i+1, len(data)):
        for k in range(j+1, len(data)):
            result = data[i]+data[j]+data[k]
            if result <= val :
                sum_val = max(result, sum_val)

print(sum_val)

# 3번의 중첩 반복문을 사용하여 풀었는데 이런식으로 풀거면 조합으로 푸는게 나을듯?