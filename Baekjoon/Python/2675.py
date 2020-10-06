case = int(input())
mylist = []
for i in range(case) :
    a = input().split()
    mylist.append(a)
for i in range(len(mylist)):
    answer = ''
    count = int(mylist[i][0])
    mun = list(mylist[i][1])
    for i in range(len(mun)) :
        for j in range(count) :
            answer += mun[i]
    print(answer)
    
