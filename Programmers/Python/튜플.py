def solution(s):
    answer = []
    arr = list(s[2:-2].split("},{"))
    k = list()
    for i in arr :
        a = list(map(int,i.split(",")))
        k.append(a)
    k.sort(key = lambda x : len(x))
    for j in k :
        for b in j :
            if b not in answer :
                answer.append(b)  
    
    return answer