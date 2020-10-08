N = int(input())
count = 1
plus = 1
answer = 0
if N == 1:
    print('1/1')
else:
    while True:
        count += 1
        if N <= plus+count:
            answer = N-plus
            break
        else :
            plus += count
    if count % 2 == 0 :                                     #지그재그 방향 설정
        print(str(answer) + '/' + str(count-answer+1))
    elif count % 2 == 1 :
        print(str(count-answer+1) + '/' + str(answer))

        