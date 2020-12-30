def solution(a, b):
    answer = ''
    day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    tmp = 0
    for i in range(a-1):
        tmp += month[i]
    tmp += b
    tmp = (tmp-1)%7
    answer = day[tmp]
    return answer