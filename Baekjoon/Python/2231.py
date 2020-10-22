def bunhae(data):
    if data<10:
        return 0
    start = data - (len(str(data))*9)
    if start < 0 :
        start = 10
    while start < data :   
        val = start
        val += sum(list(map(int,str(start))))
        if val == N :
            return start
        else :
            start += 1
    if start == data :
        return 0
N = int(input())
print(bunhae(N))