N = int(input())
answer = 0
def list1(N):
    arr = list(map(int, str(N)))
    return arr
if N<100 :
    answer = N
else :
    answer = 99
    for i in range(100, N+1):
        arr = list1(i)
        if arr[0]-arr[1] == arr[1]-arr[2]:
            answer += 1
print(answer)