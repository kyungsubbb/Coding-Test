def fibo(N):
    if N == 1 :
        return 0
    elif N == 2 :
        return 1
    else :
        return fibo(N-1)+fibo(N-2)
N = int(input())
print(fibo(N+1))