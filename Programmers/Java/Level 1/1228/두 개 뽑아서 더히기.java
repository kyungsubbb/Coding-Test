import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> answer = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        int i =0;
        int k[] = new int[answer.size()];
        for(int a : answer){
            k[i++] = a;
        }
        Arrays.sort(k);
        return k;
    }
}