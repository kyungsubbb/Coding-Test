def solution(N, stages):
    answer = []
    num = len(stages)
    arr = list()
    tmp = []
    for i in range(1,N+1):
        if num > 0 :
            arr.append(stages.count(i)/num)
            num -= stages.count(i)
        else :
            arr.append(0)
            
    for idx, val in enumerate(arr):
        tmp.append((idx, val))
    tmp.sort(key=lambda x : x[1], reverse = True)    
    
    for key in tmp:
        answer.append(key[0]+1)
        
    return answer