def solution(phone_book):
    answer = True
    phone_book.sort()
    for i in range(len(phone_book)):
        for j in range(i+1, len(phone_book)):
            if len(phone_book[i]) > len(phone_book[j]):
                continue
            elif phone_book[i] == phone_book[j]:
                return False
            else :
                if phone_book[i] in phone_book[j][: len(phone_book[i])] :
                    return False

                
    return answer