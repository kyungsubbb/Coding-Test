'''
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
'''
def solution(n):
    answer = 0
    for i in range(2, n+1):
        if sosu(i) == True :
            answer += 1
    return answer

def sosu(n):
    flag = True
    for i in range(2, int(n**0.5)+1):
        if n % i == 0 :
            flag = False
            break
    return flag