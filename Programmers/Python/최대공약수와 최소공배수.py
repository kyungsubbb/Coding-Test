from math import gcd
def solution(n, m):
    answer = []
    gc = gcd(n, m)
    answer.append(gc)
    n = n//gc
    m = m//gc
    answer.append(gc*n*m)
    
  
    return answer