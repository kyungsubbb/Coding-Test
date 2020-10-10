x, y, w, h = list(map(int, input().split()))
x_val = [x,y]
y_val = [w,h]
arr = []
for i in range(len(x_val)):
    arr.append(y_val[i] - x_val[i]) 
arr = arr + x_val
print(min(arr))