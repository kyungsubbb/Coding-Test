n = int(input())
answer = 0
leng = len(str(n))
if leng == 1 :
    print(n)
else :
    for i in range(leng-1):
        answer += 9*(10**i)*(i+1)
    answer += (n - (10 ** (leng-1))+1)*leng
    print(answer)