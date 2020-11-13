n = int(input())
arr = list(map(int, input().split()))
dic = dict()
for i in arr :
    dic[i] = 1
k = int(input())
val = list(map(int, input().split()))
for i in val:
    if i in dic :
        print(1)
    else : 
        print(0)

### 일반 탐색으로 했을 경우 시간 초과가 발생하여 arr을 해시로 변경하고, 이를 이용하여 탐색 수행
### 이로 인해 시간 복잡도는 O(n)으로 줄일 수 있었음