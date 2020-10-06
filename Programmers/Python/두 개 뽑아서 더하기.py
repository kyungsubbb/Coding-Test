def solution(numbers):
    answer=[]
    for i in range(0, len(numbers)) :
        for j in range(i+1, len(numbers)) :
            
                answer.append(numbers[i]+numbers[j])
    a1 = set(answer)
    answer = list(a1)
    answer.sort()
    
   
    return answer