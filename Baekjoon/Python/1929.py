start, finish = map(int, input().split())

finish += 1

arr = [True]*finish

for i in range(2,int(finish**0.5)+1):
    if arr[i] :
        for j in range(2*i, finish, i):
            arr[j] = False


for i in range(start, finish):
    if i > 1 and arr[i] == True:
        print(i)