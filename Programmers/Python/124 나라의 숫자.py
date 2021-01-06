def solution(n):
    
    arr = list()
    while n>0:
        if n%3 == 1 :
            arr.append(1)
        elif n%3 == 2 :
            arr.append(2)
        elif n%3 == 0 :
            n -= 1
            arr.append(4)
        n = n // 3
    arr.reverse()
    answer = ''.join(map(str,arr))
    return answer