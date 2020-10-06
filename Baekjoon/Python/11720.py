a = int(input())
b = int(input())

mylist = list(str(b))
mylist = list(map(int,mylist))

answer = sum(mylist)
print(answer)
