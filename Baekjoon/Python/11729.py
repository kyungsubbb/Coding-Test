def han(n,a,b,c):
    if n == 1:
        print(a, c)
    else :
        han(n-1, a, c, b)
        print(a, c)
        han(n-1, b, a, c)
        
n = int(input())
print((2**n) -1)
han(n, 1, 2, 3)