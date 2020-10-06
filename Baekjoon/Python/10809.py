a = input()
mylist = list(a)
alpha = list('abcdefghijklmnopqrstuvwxyz')
array = [-1 for i in range(len(alpha))]
for i in range(len(mylist)):
    for j in range(len(alpha)):
        if mylist[i] == alpha[j] :
            if array[j] != -1 :
                continue
            else :
                array[j] = i
for k in array :
    print(k, end = " ")