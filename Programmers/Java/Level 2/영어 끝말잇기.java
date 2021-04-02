import java.util.HashMap;
class Solution {
    static HashMap<String, Integer> map;
    public int[] solution(int n, String[] words) {
        int[] answer;
        String pre = words[0];
        String current = "";
        map = new HashMap<>();
        map.put(pre, 1);
        int num = 1; // 순서
        int round = 1; // 라운드
        
        for (int i = 1; i < words.length; i++) {
			current = words[i];
			if(!map.containsKey(current) && pre.charAt(pre.length()-1) == current.charAt(0)) {
				map.put(current, 1);
				pre = current;
				if((num + 1)%n == 0) {
					num = 0;
					round++;
				}else {
					num ++;
				}
				
			}
			else {
				answer = new int[2];
				answer[0] = num+1;
				answer[1] = round;
				return answer;
			}
			
		}
        return new int[]{0, 0};
    }
}