N = int(input())
def factorial(N):
    if N>1 :
        return N*factorial(N-1)
    else :
        return 1
print(factorial(N))