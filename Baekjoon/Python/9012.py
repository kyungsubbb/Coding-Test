import sys

num = int(sys.stdin.readline())
for _ in range(num):
    cnt = 0
    arr = list(sys.stdin.readline())
    for i in arr :
        if cnt >= 0 :
            if i == "(":
                cnt += 1
            elif i == ")" :
                    cnt -= 1
        else :
            break

    if cnt != 0:
        print("NO")
    else :
        print("YES")