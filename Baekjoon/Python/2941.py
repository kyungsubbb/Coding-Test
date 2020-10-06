words = input()
    
change = ['c=', 'c-','dz=','d-','lj','nj','s=','z=']
for i in change :
    words = words.replace(i,'*')
answer = len(words)
print(answer)