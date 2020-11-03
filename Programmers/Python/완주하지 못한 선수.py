def solution(participant, completion):
    answer = ''
    dic = dict()
    for i in participant :
        if i not in dic :
            dic[i] = 1 
        else :
            dic[i] += 1
    for k in completion :
        dic[k] -= 1
    answer = [k for k,v in dic.items() if v ==1][0]
    
    return answer