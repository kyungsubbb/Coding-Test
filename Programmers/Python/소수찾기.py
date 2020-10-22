from itertools import permutations
def solution(numbers):
    answer = 0
    arr = set()
    for i in range(1, len(numbers)+1):
        pm = permutations(numbers, i)
        for k in pm:
            arr.add(int("".join(k)))

    for j in arr:
        if sosu(int(j)):
            answer+=1
        
    return answer

def sosu(data):
    if data <= 1:
        return False
    elif data == 2:
        return True
    else :
        for i in range(2,data):
            if data%i == 0 :
                return False
        return True