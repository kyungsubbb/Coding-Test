n = int(input())
for i in range(n):
    val = input()
    stack1 = []
    stack2 = []
    for j in range(len(val)):
        if val[j] == '<':
            if stack1 :
                stack2.append(stack1.pop())
        elif val[j] == '>':
            if stack2 :
                stack1.append(stack2.pop())
        elif val[j] == '-' :
            if stack1 :
                stack1.pop()
        else : 
            stack1.append(val[j])
    print(''.join(stack1)+''.join(reversed(stack2)))