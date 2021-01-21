n = int(input())
for i in range(1,n+1):
    a = input()
    for j in range(1, len(a)+1):
        if a[0:j] == a[j : j+j] :
            print("#{} {}".format(i, j))
            break