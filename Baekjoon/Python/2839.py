N = int(input())
five = N//5
answer = 0
while True:
    if five <= 0:
        if N/3 != int(N/3) :
            answer = -1
        else :
            answer = N//3
        print(answer)
        break
    else :
        if (N-five*5)/3 != int((N-five*5)/3):
            five -= 1
        else :
            answer = five + (N-five*5)//3
            print(answer)
            break