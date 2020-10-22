def solution(answers):
    answer = [] 
    leng = len(answers)
    one = [ 1, 2, 3, 4, 5] * ((leng//5)+1)
    two = [2, 1, 2, 3, 2, 4, 2, 5] * ((leng//8)+1)
    three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * ((leng//10)+1)
    result = [0]*4
    
    for i in range(leng) :
        if answers[i] == one[i]:
            result[1] += 1
        if answers[i] == two[i]:
            result[2] += 1
        if answers[i] == three[i]:
            result[3] += 1
    val = max(result)
    for i in range(len(result)):
        if val == result[i]:
            answer.append(i)
   
    return answer