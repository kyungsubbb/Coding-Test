def count(N, num):
    cnt = 0
    div = num
    while (N>= div):
        cnt += (N // div)
        div *= num
    return cnt

a,b= map(int,input().split())
print(min(count(a,2)-count(b,2)-count(a-b,2), count(a,5)-count(b,5)-count(a-b,5)))