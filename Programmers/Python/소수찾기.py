'''
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

'''

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