N= 123456*2+1
sosu = [True]*N
sosu[0] = False
sosu[1] = False

for i in range(2, int(N**0.5)+1):
    if sosu[i] :
        for j in range(2*i, N, i):
            sosu[j] = False
            
def count(N):
    count = 0
    for i in range(a+1, 2*a+1):
        if sosu[i] :
            count += 1
    print(count)
while True :
    a = int(input())
    if a == 0 :
        break
    count(a)