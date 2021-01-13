<<<<<<< HEAD
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int value=0;
        int []tmp = new int[arr.length];
        tmp[value]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(tmp[value]!=arr[i]){
                value++;
                tmp[value]=arr[i];
            }
        }
        answer = new int[value+1];
        for(int i=0; i<answer.length; i++){
            answer[i]=tmp[i];
        }
        return answer;
    }
=======
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int value=0;
        int []tmp = new int[arr.length];
        tmp[value]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(tmp[value]!=arr[i]){
                value++;
                tmp[value]=arr[i];
            }
        }
        answer = new int[value+1];
        for(int i=0; i<answer.length; i++){
            answer[i]=tmp[i];
        }
        return answer;
    }
>>>>>>> 1b293a049fc6f80cba1d2a1a4bf2df0679da393c
}