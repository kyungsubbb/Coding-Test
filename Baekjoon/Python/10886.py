n = int(input())
cnt0 = 0
cnt1 = 0
for i in range(n):
    a = int(input())
    if a == 0 :
        cnt0 += 1
    elif a == 1 :
        cnt1 += 1
    else :
        exit(0)
if cnt0>cnt1 :
    print("Junhee is not cute!")
else :
    print("Junhee is cute!")