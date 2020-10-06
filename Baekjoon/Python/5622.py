words = input()
answer = 0

s = ['ABC','DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', "WXYZ"]
for i in range(len(words)):
    for j in s :
        if words[i] in j :
            answer += s.index(j) +2
answer += len(words)
print(answer)