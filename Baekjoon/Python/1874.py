n = int(input())
cnt = 1
arr = []
rst = []
for i in range(n):
    a = int(input())
    while a >= cnt :
        arr.append(cnt)
        cnt += 1
        rst.append("+")
    if arr[-1] == a :
        arr.pop()
        rst.append("-")
    else :
        break
        
if len(rst) == n*2 :
    for i in rst :
        print(i)
else :
    print("NO")
        

        # fastcampus의 아이디어를 보고 코딩함