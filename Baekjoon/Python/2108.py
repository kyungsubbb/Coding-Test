import sys

def mean(data):
    return round(sum(data)/len(data))
def midian(data):
    data.sort()
    if len(data)%2 == 0 :
        return (data[len(data)//2]+data[len(data)//2 -1])/2
    elif len(data)%2 == 1 :
        return data[len(data)//2]
from collections import Counter
def count(data) :
    if len(data) == 1 :
        return data[0]
    a = Counter(data)
    mode = a.most_common()
    #mode.sort(key=lambda x : x[0])
    if mode[0][1] == mode[1][1] :
        return mode[1][0]
    else :
        return mode[0][0]
def min_max(data):
    return max(data)-min(data)
n = int(sys.stdin.readline())
arr = []
for i in range(n):
    arr.append(int(sys.stdin.readline()))
print(mean(arr))
print(midian(arr))
print(count(arr))
print(min_max(arr))