a = {}
munja = input()
mylist = list(munja.lower())
for i in mylist :
    if i in a:
        a[i] += 1
    else :
        a[i]=1
sortval = sorted(a.items(), key = lambda x: x[1], reverse = True)
a1 = sortval[0][1]
if len(a.keys()) > 1 :
    a2 = sortval[1][1]
    if a1 == a2 :
        print('?')
    else :
        print(sortval[0][0].upper())
else :
    print(sortval[0][0].upper())