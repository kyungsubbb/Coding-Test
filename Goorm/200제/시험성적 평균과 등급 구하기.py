arr = list(map(int, input().split()))
avg = sum(arr)/len(arr)

if avg >= 90 :
	print("%0.2f A" % avg)
elif avg >=80 :
	print("%0.2f B" % avg)
elif avg >= 70 :
	print("%0.2f C" % avg)
elif avg >= 60 :
	print("%0.2f D" % avg)
else :
	print("%0.2f F" % avg)