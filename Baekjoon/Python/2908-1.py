a = input().split()
m1 = a[0]
m2 = a[1]
m1 = list(m1)
m1.reverse()
m1 = ''.join(m1)
m2 = list(m2)
m2.reverse()
m2 = ''.join(m2)

print(max(m1, m2))