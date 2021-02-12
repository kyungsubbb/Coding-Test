class Solution {
    public int[] solution(String s) {
        String a1 = s;
        int cnt = 0;		// 0의 개수
		int count = 0;      // 실행 횟수
		while(true) {
			count ++ ;
			for (int i = 0; i < a1.length(); i++) {
				if(a1.charAt(i) == '0') cnt ++;
			}
			String tmp = a1.replace("0", "");
			if(tmp.equals("1")) break;
			int sum = tmp.length();
			a1 = Integer.toBinaryString(sum); 
		}
        int[] answer = {count,cnt};
        return answer;
    }
}