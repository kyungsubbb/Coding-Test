def solution(s, n):
    answer = ''
    for i in s:
        if "a"<= i <="z":
            if chr(ord(i)+n) > "z":
                answer += chr(ord(i)+n-26)
            else :
                answer += chr(ord(i)+n)
        elif "A"<= i <="Z":
            if chr(ord(i)+n) > "Z":
                answer += chr(ord(i)+n-26)
            else :
                answer += chr(ord(i)+n)
        else :
            answer += i
    return answer