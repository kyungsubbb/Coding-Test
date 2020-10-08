b = int(input())
a = []
for i in range(b):
    a.append(input())
for i in range(len(a)):
    answer = 0
    count = 0
    m = list(a[i])
    for k in range(len(m)):
        if m[k] == 'O':
            count += 1
            answer += count
        else :
            count = 0
    print(answer)