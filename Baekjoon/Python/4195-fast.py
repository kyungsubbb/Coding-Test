def find(x) :
    if x == parent[x]:
        return x
    else :
        p = find(parent[x])
        parent[x] = p
        return parent[x]
def union(x, y):
    x = find(x)
    y = find(y)
    
    if x != y :
        parent[y] = x
        number[x] += number[y]
n = int(input())
for i in range(n):
    parent = dict()
    number = dict()
    
    a = int(input())
    
    for k in range(a):
        x, y = input().split()
        if x not in parent :
            parent[x] = x
            number[x] = 1
        if y not in parent:
            parent[y] = y
            number[y]=1
        union(x,y)
        print(number[find(x)])



# Union-Find 알고리즘을 사용했는데 솔직히 아직 이해는 잘 안감.
