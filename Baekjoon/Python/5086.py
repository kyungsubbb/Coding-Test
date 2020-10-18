while True:
    arr = list(map(int, input().split()))
    if arr == [0, 0] :
        break
    else :
        if arr[0]/arr[1] == arr[0]//arr[1] :
            print('multiple')
        elif arr[1]/arr[0] == arr[1]//arr[0] :
            print('factor')
        else :
            print('neither')
        