import collections

class dequeue:
    def __init__(self):
        self.deque = collections.deque()
        
    def pu_back(self, num):
        self.deque.append(num)
    
    def pu_front(self, num):
        self.deque.appendleft(num)
        
    def p_back(self):
        if self.deque:
            return self.deque.pop()
        else :
            return -1
    def p_front(self):
        if self.deque:
            return self.deque.popleft()
        else :
            return -1
    def empty(self):
        if self.deque:
            return 0
        else :
            return 1
    def size(self):
        return len(self.deque)
    
    def front(self):
        if self.deque:
            return self.deque[0]
        else :
            return -1
    def back(self):
        if self.deque:
            return self.deque[-1]
        else:
            return -1    

import sys

n = int(sys.stdin.readline())
arr = dequeue()
for _ in range(n):
    inst = (sys.stdin.readline()).split()
    if inst[0] == "push_back" :
        arr.pu_back(inst[1])
    elif inst[0] == "push_front" :
        arr.pu_front(inst[1])
    elif inst[0] == "pop_front" :
        print(arr.p_front())
    elif inst[0] == "pop_back" :
        print(arr.p_back())
    elif inst[0] == "size" :
        print(arr.size())
    elif inst[0] == "empty" :
        print(arr.empty())
    elif inst[0] == "front" :
        print(arr.front())
    elif inst[0] == "back" :
        print(arr.back())