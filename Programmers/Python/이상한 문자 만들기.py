def solution(s):
    answer = ''
    cnt = 0
    for i in s:
        if i == " ":
            answer += " "
            cnt = 0
        elif cnt % 2 == 0:
            answer += i.upper()
            cnt += 1
        else :
            answer += i.lower()
            cnt += 1
        
    return answer