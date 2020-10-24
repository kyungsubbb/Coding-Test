def solution(numbers):
    answer = ''
    clone = list(map(str, numbers))
    a = sorted(clone, key=lambda x : x*3, reverse = True)
    # numbers를 문자열로 만들고, 이를 *3해줌으로써 1000이하의 범위안에서 비교하게 됨
    # 또한 reverse를 통해서 가장 큰 수부터 내림차순으로 배열
    answer = str(int( ''.join(a)))
    # 0000과 같은 수가 존재할 수 있어 int형으로 형변환함 ==> 0으로 변경
    # 다시 str로 형변환함으로써 문자열로 return 하게됨
    return answer