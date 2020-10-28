N = int(input())
mylist = []
for i in range(666, 9996666) :
    if '666' in  str(i):
        mylist.append(i)
print(mylist[N-1])