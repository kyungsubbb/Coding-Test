from collections import deque

a, b = map(int, input().split())
arr = deque([])
ans = list()
for i in range(1, a+1):
    arr.append(i)
cnt = 0
while len(arr)>0:
    cnt += 1
    if cnt != b :
        arr.append(arr.popleft())
    else :
        ans.append(arr.popleft())
        cnt = 0

answer = ", ".join(map(str, ans))
print("<" + answer + ">")