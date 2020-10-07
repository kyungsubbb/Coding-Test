a = list()
for i in range(10):
    a.append(int(input()))
v = [0 for i in range(42)]
for i in a :
    v[i%42] += 1
count = 0
for i in range(len(v)) :
    if v[i] != 0 :
        count += 1
print(count)