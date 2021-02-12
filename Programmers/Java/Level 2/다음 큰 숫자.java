class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
		for (int i = n+1; i < 2*n; i++) {
			if(count == Integer.bitCount(i)) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}
// 비트로 변환해서 그냥 탐색하는게 구현도 편하고..
// API를 사용했음