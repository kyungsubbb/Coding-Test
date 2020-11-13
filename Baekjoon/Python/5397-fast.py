n = int(input())
for i in range(n):
    val = input()
    stack1 = []
    stack2 = []
    for j in val:
        if j == '<':
            if stack1:
                stack2.append(stack1.pop())
        elif j == '>':
            if stack2:
                stack1.append(stack2.pop())
        elif j == '-' :
            if stack1:
                stack1.pop()
        else :
            stack1.append(j)
    stack1.extend(reversed(stack2))
    print(''.join(stack1))