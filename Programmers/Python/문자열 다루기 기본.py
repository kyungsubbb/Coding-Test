def solution(s):
    flag = False
    if len(s) == 4 or len(s) == 6 :
        for i in s :
            if '0' <= i <= '9' :
                flag = True
            else :
                return False
    else :
        return False

    return True