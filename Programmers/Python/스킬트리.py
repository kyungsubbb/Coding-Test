def solution(skill, skill_trees):
    answer = 0
    sk = list(skill)
    flag = True
    for i in skill_trees:
        ans = [99]*len(sk)
        arr = [99]*len(sk)
        for j in range(len(sk)):
            if i.find(sk[j]) == -1 :
                ans[j] == 99
                arr[j] == 99
            else :
                ans[j] = i.find(sk[j])
                arr[j] = i.find(sk[j])
        arr.sort()
        if arr == ans :
            answer += 1
    return answer