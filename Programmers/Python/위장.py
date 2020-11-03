def solution(clothes):
    answer =1 
    dic = dict()
    for i in range(len(clothes)):
        if clothes[i][1] not in dic :
            dic[clothes[i][1]] = [clothes[i][0]]
        else :
            dic[clothes[i][1]].append(clothes[i][0])

    for k in dic:
        answer *= len(dic[k])+1

        
    answer -= 1
    return answer