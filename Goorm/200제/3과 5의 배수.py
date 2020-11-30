def sigma(data):
	return data*(data+1)//2

user_input = int(input())
th = user_input // 3
fi = user_input // 5
fif = user_input // 15
print(3*sigma(th) + 5*sigma(fi) - 15 * sigma(fif))
