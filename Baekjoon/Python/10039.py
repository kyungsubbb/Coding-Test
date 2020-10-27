arr = []
for i in range(5):
    val = int(input())
    if val > 40 :
        arr.append(val)
    else :
        arr.append(40)
    
print(sum(arr)//5)