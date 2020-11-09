a,b = map(int, input().split())
answer = 0
if a>= b :
    answer += a-1
    answer += a*(b-1)
    print(answer)
else :
    answer += b-1
    answer += b*(a-1)
    print(answer)