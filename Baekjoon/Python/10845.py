import sys
from collections import deque


class queue:
    def __init__(self):
        self.queue = deque([])
    
    def push(self, num):
        self.queue.append(num)
    
    def pop(self):
        if self.queue:
            return self.queue.popleft()
        else :
            return -1
    def size(self):
        return len(self.queue)

    def empty(self):
        if len(self.queue) == 0 :
            return 1
        else :
            return 0

    def front(self):
        if self.queue :
            return self.queue[0]
        else :
            return -1
            
    def back(self):
        if self.queue :
            return self.queue[-1]
        else :
            return -1


n = int(input())
ans = queue()
for i in range(n):
    arr = input().split()
    if arr[0] == "push" :
        ans.push(arr[1])
    elif arr[0] == "pop" :
        print(ans.pop())
    elif arr[0] == "size" :
        print(ans.size())
    elif arr[0] == "empty" :
        print(ans.empty())
    elif arr[0] == "front" :
        print(ans.front())
    elif arr[0] == "back" :
        print(ans.back())

'''
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

'''