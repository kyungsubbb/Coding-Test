n = input()
alpha = [0]*26
alpha_s = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
for i in n :
    alpha[alpha_s.index(i)] += 1
for i in alpha:
    print(i, end = " ")