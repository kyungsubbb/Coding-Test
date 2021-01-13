import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int[] tmp = new int[d.length];
        for(int i=0; i<d.length; i++){
            tmp[i] = d[i];
        }
        Arrays.sort(tmp);
        for(int i=0; i<tmp.length; i++){
            if(budget >= tmp[i]){
                budget -= tmp[i];
                answer++;
            }
        }
        return answer;
    }
}