n = int(input())
cal = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
for i in range(n):
    val = input()
    year = val[0:4]
    month = val[4:6]
    day = val[6:8]
    if 0<int(month)<=12 :
        if 1<=int(day)<=cal[int(month)-1]:
            print("#{} {}/{}/{}".format(i+1, year, month, day))
        else :
            print("#{} -1".format(i+1))
    else :
        print("#{} -1".format(i+1))