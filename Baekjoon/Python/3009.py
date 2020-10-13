x=dict()
y=dict()
for i in range(3):
    a,b = map(int,input().split())
    if a in x :
        x[a] += 1
    else :
        x[a] = 1
    if b in y :
        y[b] += 1
    else :
        y[b] = 1
for k,v in x.items():
    if v == 1:
        val_x = k
        
for k,v in y.items():
    if v == 1:
        val_y = k
print(val_x, val_y)