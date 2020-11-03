def solution(genres, plays):
    answer = []
    dic = dict()  # 각 항목별 묶음
    dic1 = dict()  # 각 항목별 합
    cnt = 0
    for i in range(len(genres)) :
        if genres[i] not in dic :
            dic[genres[i]] = [(plays[i], i)]
            dic1[genres[i]] = plays[i]
        else :
            dic[genres[i]].append((plays[i],i))
            dic1[genres[i]] += plays[i]
    
    sorted_a = sorted(dic1.items(), key=lambda x : x[1], reverse = True) # 합계순으로 정렬
    for k in sorted_a :  #합계에서 큰 것부터 하나씩 pick
        arr = dic[k[0]]  # 큰 튜블의 이름 pick
        arr = sorted(arr, key=lambda x : x[0], reverse = True)  
        for i in range(len(arr)): #arr의 이름 받은 것의 튜플 중 큰것부터 2개 answer에 넣기
            if i == 2:
                break
            answer.append(arr[i][1])

    return answer