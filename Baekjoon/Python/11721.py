n = input()
cnt = 0
for i in n :
    if cnt<9:
        print(i, end = '')
        cnt += 1
    else :
        print(i, end = '\n')
        cnt = 0