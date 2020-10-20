arr = input()

def reverse(data):
    arr = list(str(data))
    arr.sort()
    arr.reverse()
    ans = ''
    for i in range(len(arr)) :
        ans += arr[i]
    return int(ans)

print(reverse(arr))