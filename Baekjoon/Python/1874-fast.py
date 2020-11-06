n = int(input())

count = 1
stack = []
result = []

for i in range(1,n+1):
    data = int(input())
    while count <= data :
        stack.append(count)
        count += 1
        result.append('+')
    if stack[-1] == data :
        stack.pop()
        result.append('-')
    else :
        print('NO')
        exit(0)
print('\n'.join(result))
        

# Python3 - 5056ms
# Pypy3 - 280ms

# Pypy로 실행할 경우 메모리는 더 사용할지라도 시간은 더 적어진다~