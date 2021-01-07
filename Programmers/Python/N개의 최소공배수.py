from math import gcd
def solution(arr):
    answer = 0
    arr.sort()
    first = gcd(arr[0], arr[1]) * (arr[0]//gcd(arr[0], arr[1])) * (arr[1]//gcd(arr[0], arr[1]))
    if len(arr) > 2:
        for i in range(2, len(arr)):
            answer = gcd(arr[i], first) * (first//gcd(arr[i], first)) * (arr[i]//gcd(arr[i], first))
            first = answer
    return answer