user_input = int(input())
flag = True


for i in range(2, int(user_input**0.5)+1):
	if user_input % i == 0 :
		flag = False
		break
print(flag)
