N = int(input())
def fibo_dp(N):
    cache = [0 for i in range(N+1)]
    cache[0] = 0
    cache[1] = 1
    for i in range(2, len(cache)):
        cache[i] = cache[i-1]+cache[i-2]
    return cache[N]
print(fibo_dp(N))