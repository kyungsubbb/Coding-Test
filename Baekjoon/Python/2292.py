N = int(input())
first = 1
room = 1
plus = 6
if N == 1:
    print(room)
else:
    while True:
        first += plus
        room += 1
        if N <= first:
            print(room)
            break
        plus += 6