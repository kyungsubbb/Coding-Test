import sys
from collections import deque

n = int(sys.stdin.readline())
ans = deque([])
for i in range(n):
    arr = sys.stdin.readline().split()
    if arr[0] == "push" :
        ans.append(int(arr[1]))
    elif arr[0] == "pop" :
        if len(ans) >= 1:
            print(ans.popleft())
        else :
            print(-1)
    elif arr[0] == "size" :
        print(len(ans))
    elif arr[0] == "empty" :
        if len(ans) == 0 :
            print(1)
        else :
            print(0)
    elif arr[0] == "front" :
        if len(ans) != 0 :
            print(ans[0])
        else :
            print(-1)
        
    elif arr[0] == "back" :
        if len(ans) != 0 :
            print(ans[-1])
        else :
            print(-1)