def solution(n):
    answer = 0
    val = list(map(int,str(convert(n,3))))
    val.reverse()
    answer = ten(val)
    
    return answer

def convert(data, base):
    a =  '0123456789'
    q, r = divmod(data, base)
    if q == 0 :
        return a[r]
    else :
        return convert(q,base)+a[r]
    
def ten(arr):
    answer = 0
    data =list(map(int ,str(int("".join(map(str, arr))))))
   #print(data)
    for i in range(len(data)):
        answer += data[i]*(3**(len(data)-i-1))
        #print(answer)
    return answer
    
    
