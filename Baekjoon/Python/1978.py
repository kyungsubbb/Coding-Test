N = int(input())
arr = list(map(int, input().split()))
count = 0
a = False
for i in range(len(arr)) :
    if arr[i] > 1:
        if arr[i] == 2:
            count += 1
        else :
            for j in range(2,arr[i]) :
                if arr[i]/j == int(arr[i]/j) :  # 나눠 떨어지는 수가 있을 때 skip
                    a = False
                    break
                else :
                    a = True
                    continue
    if a == True :
        count += 1
print(count)