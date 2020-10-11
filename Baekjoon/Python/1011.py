N = int(input())
for j in range(N):
    a, b = list(map(int, input().split()))
    length = b-a
    count = 2
    for i in range(2**31):
        if length == 1 :
            print(1)
            break
        else :
            if  ((count+1)//2)**2 >= length :
                print(count)
                break
            elif (count//2)*(count//2+1) >= length :
                print(count)
                break
        count += 1