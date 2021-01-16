n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    print("#{} {} {}".format(i+1, a//b, a%b) )