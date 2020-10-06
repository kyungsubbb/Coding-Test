mylist = input().split()
A = int(mylist[0])
B = int(mylist[1])
C = int(mylist[2])

print((A+B)%C)
print(((A%C)+(B%C))%C)
print((A*B)%C)
print(((A%C)*(B%C))%C)
