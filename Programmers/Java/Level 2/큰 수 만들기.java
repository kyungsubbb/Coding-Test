import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();						// 스택 생성
        stack.push(number.charAt(0)-'0');							// 첫 번째 요소 넣음
        int num = 0;												// 삭제한 요소 개수
    	for (int i = 1; i < number.length(); i++) {					// 하나씩 넣어봄
			stack.push(number.charAt(i)-'0');						// 우선 넣고
			while(stack.size() != 1 && stack.get(stack.size()-1)>stack.get(stack.size()-2) && num < k) {		// 스택의 사이즈가 1개 이상이고, 위가 아래보다 크고, 삭제한 요소값이 k보다 작을 때
				stack.remove(stack.size()-2);						// 지금 넣은 값이랑 아래값이랑 비교해서 넣은 값이 크면 아랫값을 삭제
				num++;												// 삭제 개수 증가
			}
		}
    	
        String result = "";
        for (int i = 0; i < number.length()-k; i++) {				// 스택 전체를 바꾸니까 12번 테스트케이스 오류
			result += stack.get(i);									// 999, 2의 경우를 넣어보니 스택에 999 저장. 따라서 출력 개수만 맞춰서 뽑아옴
		}
    	return result;
    }
}

// 부분집합 만들기로 푸려하였으나, 시간 초과의 문제로 검색해 본 결과
// 스택을 사용하면 됨을 알게됨.