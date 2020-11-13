def draw(x, y, n):
    if n == 1:
        map[x][y]='*'
        return
    div = int(n/3)  
    for i in range(3):
        for j in range(3):
            if i == 1 and j == 1 : continue
            draw(x+div*i, y+div*j , div)
n=int(input())
map = [[' 'for i in range(n)] for _ in range(n)]
draw(0, 0, n) 
for i in range(n):          
    print(''.join(map[i]))