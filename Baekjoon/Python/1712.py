a = input().split()
a = list(map(int, a))
result = 0
if a[2]-a[1] <= 0 :
    result = -1
else :
    result =int(a[0]/(a[2]-a[1])+1) 
print(result)