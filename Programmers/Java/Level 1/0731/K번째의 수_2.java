import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int count = commands[i][2];
            int []temp = new int[end - start +1];
            int arr = 0;
            for (int j=start -1; j<end; j++){
                temp[arr++]=array[j];
                
            }
            Arrays.sort(temp);
            answer[index++]=temp[count-1];
        }
        return answer;
    }
}