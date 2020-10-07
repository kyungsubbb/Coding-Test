count = input().split()
mylist = input().split()
answer = ''
for i in range(int(count[0])):
    if int(count[1]) > int(mylist[i]):
        answer += mylist[i]+' '
print(answer)