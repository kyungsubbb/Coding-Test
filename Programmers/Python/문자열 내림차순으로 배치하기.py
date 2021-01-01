def solution(s):
    a = list(s)
    a.sort(reverse = True)
    answer = ''.join(a)
    return answer