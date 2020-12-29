def solution(arr):
    answer = list()
    for i in arr:
        if len(answer) == 0:
            answer.append(i)
        elif answer[-1] != i:
            answer.append(i)
        else :
            continue
    return answer