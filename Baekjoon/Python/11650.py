N = int(input())
arr = []

for i in range(N) :
    arr.append( list(map(int,input().split())))

arr.sort()

for i in range(N):
    print(arr[i][0],arr[i][1])

'''
1. (x 좌표, y 좌표)를 입력 받은 뒤 x좌표, y좌표 순서대로 차례대로 오름차순 정렬합니다.
2. 파이썬의 기본 정렬 라이브러리는 기본적으로 튜플의 인덱스 순서대로 오름차순 정렬합니다.
3. 따라서 단순히 기분 정렬 라이브러리를 이용하면 됩니다. (key 속성 설정 없이)
'''