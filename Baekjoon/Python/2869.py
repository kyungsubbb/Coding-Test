a,b,v = map(int, input().split())
count = (v-b)/(a-b)
if count == int(count) :
    print(int(count))
else :
    print(int(count+1))
