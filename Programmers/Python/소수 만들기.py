from itertools import combinations
def solution(nums):
    answer = 0
    arr=list(combinations(nums,3))
    brr = []
    for i in arr:
        brr.append(sum(i))
    print(brr)
    for j in brr:
        if sosu(j) == True :
            answer += 1
    return answer

def sosu(data):
    if data <= 1:
        return False
    elif data == 2 :
        return True
    else :
        for i in range(2, int(data**0.5) + 1):
            if data%i == 0 :
                return False
        return True