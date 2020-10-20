N = int(input())

data_list = []

for i in range(N):
    arr =input().split()
    data_list.append([arr[0], arr[1]])

data_list.sort(key=lambda x : int(x[0]) )
for i in range(len(data_list)) :
    print(data_list[i][0], data_list[i][1])