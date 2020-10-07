A = int(input())
B = int(input())
C = int(input())
value = A*B*C
a = list(str(value))
b = [0 for i in range(10)]
for i in a:
    b[int(i)] +=1
for i in range(10):
    print(b[i])