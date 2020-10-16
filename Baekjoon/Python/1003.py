def fibo_dp(n):
    cache0 = [0 for i in range(n+1)]
    cache1 = [0 for i in range(n+1)]
    if n< 1:
        return 1, 0
    else :   
        cache0[0] = 1
        cache1[1] = 1

        for i in range(2,n+1):
            cache0[i] = cache0[i-1]+cache0[i-2]
            cache1[i] = cache1[i-1]+cache1[i-2]
        return cache0[n],cache1[n]
N = int(input())
for i in range(N):
    k = int(input())
    a,b = fibo_dp(k)
    print(a,b)
    