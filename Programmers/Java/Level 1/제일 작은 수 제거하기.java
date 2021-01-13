import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] tmp= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            tmp[i]=arr[i];
        }
        Arrays.sort(tmp);
        int min = tmp[0];
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length-1];
            int value = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=min){
                    answer[value]=arr[i];
                    value++;
                }
            }
        }
        return answer;
    }
}