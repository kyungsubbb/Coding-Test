def solution(brown, yellow):
    answer = []
    k = yaksu(yellow)
    if len(k) == 1 :
        return [k[0]+2, k[0]+2]
    elif len(k)  == 2:
        return [k[1]+2, k[0]+2]
    else :
        if len(k)%2 == 1 :
            a = -1
            for i in range((len(k)//2)+1):
                if ((k[i]+1) + (k[a]+1))*2 == brown :
                    return [k[a]+2, k[i]+2]
                else :
                    a -=1
                    continue
                    
        elif len(k)%2 == 0:
            a = -1
            for i in range(len(k)//2):
                if ((k[i]+1) + (k[a]+1))*2 == brown :
                    return [k[a]+2, k[i]+2]
                else :
                    a -=1
                    continue


def yaksu(data) :
    arr = []
    for i in range(1,data+1):
        if data%i == 0 :
            arr.append(i)
    return arr