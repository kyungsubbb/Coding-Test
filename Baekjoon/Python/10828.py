class stack:
    def __init__(self):
        self.stack = list()
    def push(self, num):
        self.stack.append(num)
    def pop(self):
        if self.stack:
            return self.stack.pop()
        else :
            return -1
    def size(self):
        return len(self.stack)
    def empty(self):
        if self.stack:
            return 0
        else :
            return 1
    def top(self):
        if self.stack:
            return self.stack[-1]
        else :
            return -1
        
import sys

n = int(sys.stdin.readline())
arr = stack()
for _ in range(n):
    inst = sys.stdin.readline().split()
    if inst[0] == "push":
        arr.push(inst[1])
    elif inst[0] == "pop":
        print(arr.pop())
    elif inst[0] == "size":
        print(arr.size())
    elif inst[0] == "empty":
        print(arr.empty())
    elif inst[0] == "top":
        print(arr.top())