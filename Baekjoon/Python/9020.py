sosu = [True]*10000
sosu[0] = False
sosu[1] = False
for i in range(2,len(sosu)) :
    for j in range(2, int(i**0.5)+1):
        if i%j == 0:
            sosu[i] = False
            break
        else :
            continue
a = 0
b = 0
N = int(input())
for i in range(N):
    value = int(input())
    for j in range(2,int(value/2)+1) :
        if sosu[j] == True and sosu[value-j] == True:
            a = j
            b = value - j
        else :
            continue
    print(a,b)