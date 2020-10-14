N = int(input())
a = [0 for i in range(3)]
b = [0 for i in range(3)]
for i in range(N):
    a[0], a[1], a[2], b[0], b[1], b[2] = map(int, input().split())
    dist = (((b[0]-a[0])**2)+((b[1]-a[1])**2))**0.5
    plus = a[2]+b[2]
    minus = a[2]-b[2]
    if minus < 0 :
        minus = -1 * minus
    if a == b :
        print(-1)
    else :
        if dist == plus or dist == minus:
            print(1)
        elif dist < max(a[2], b[2]):
            if dist < minus :
                print(0)
            elif dist > minus :
                print(2)
        else :
            if dist > plus :
                print(0)
            elif dist < plus :
                print(2)