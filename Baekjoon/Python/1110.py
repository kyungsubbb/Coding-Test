case = input()
if int(case) <10:
    case = '0'+case
a = list(map(int,list(case)))
count =1
while True:
    s =sum(a)
    a[0], a[1] = a[-1], s%10
    if a == list(map(int, list(case))) :
        break
    else :
        count += 1
print(count)