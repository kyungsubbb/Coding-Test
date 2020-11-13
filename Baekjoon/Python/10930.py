import hashlib
val = input()
result = hashlib.sha256(val.encode())
print(result.hexdigest())