def solution(n):
    answer = []
    tri = [[0]*i for i in range(1, n+1)]
    i=0
    j=0
    cnt=1
    max = n*(n+1)//2
    tri[i][j] = cnt
    while cnt < max :
        while i+1 < n and tri[i+1][j] == 0:
            i += 1
            cnt += 1
            tri[i][j] = cnt
        while j+1 < n and tri[i][j+1] == 0:
            j += 1
            cnt += 1
            tri[i][j] = cnt
        while i-1 < n and j-1<n and tri[i-1][j-1] == 0:
            i -= 1
            j -= 1
            cnt += 1
            tri[i][j] = cnt
    for a in tri:
        answer.extend(a)
    return answer