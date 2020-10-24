def solution(progresses, speeds):
    answer = []
    result = []
    arr = [0]*len(progresses)
    for i in range(len(progresses)):
        if (100 - progresses[i])%speeds[i] > 0 :
            arr[i] = ((100 - progresses[i])//speeds[i]) +1
        else :
            arr[i] = ((100 - progresses[i])//speeds[i]) 
    cnt = 1
    while arr:
        val = arr.pop(0)
        for i in range(len(arr)):
            if val >= arr[0] :
                cnt += 1
                arr.pop(0)
            else :
                answer.append(cnt)
                cnt = 1
                break
    answer.append(cnt)
    
    
    
    
    return answer