a , b= list(map(int, input().split()))

up = 1
down = 1

for j in range(b):
    up *= a
    down *= j+1 
    a -= 1

print(up//down)