case = int(input())
mylist = []
for i in range(case):
    a = input()
    mylist.append(a)
count = 0
for i in range(len(mylist)):
    klist = []
    
    for j in range(len(mylist[i])):             
        if mylist[i][j] in klist :
            if mylist[i][j-1] == mylist[i][j] :
                continue
            else :
                count -= 1
                break
        else :
            klist.append(mylist[i][j])
    count += 1

print(count)