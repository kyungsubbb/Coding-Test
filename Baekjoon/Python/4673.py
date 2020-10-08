def d(a):
    value = list(map(int,list(str(a))))
    num = a
    num += sum(value)
    
    return num
num = [0 for i in range(1,10001)]
for i in range(1,len(num)+1):
    if d(i) < 10000 :
        num[d(i)] = 1
for i in range(1, len(num)):
    if num[i] != 1 :
        print(i)