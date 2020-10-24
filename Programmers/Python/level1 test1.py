def solution(s):
    answer = False
    arr = list(s)
    if len(arr) == 4 or len(arr) == 6 :
        if s.isdigit() : # 숫자인지 확인하는 메소드
            answer = True
        else :
            answer = False
    return answer