<<<<<<< HEAD
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] tmp = new int[arr.length];
        int value =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                tmp[value]=arr[i];
                value++;
            }
        }
        if(value==0){
            tmp[0]=-1;
            value++;
        }
        answer = new int[value];
        for(int i=0; i<answer.length; i++){
            if(tmp[i]!=0)
                answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        return answer;
    }
=======
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] tmp = new int[arr.length];
        int value =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                tmp[value]=arr[i];
                value++;
            }
        }
        if(value==0){
            tmp[0]=-1;
            value++;
        }
        answer = new int[value];
        for(int i=0; i<answer.length; i++){
            if(tmp[i]!=0)
                answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        return answer;
    }
>>>>>>> 1b293a049fc6f80cba1d2a1a4bf2df0679da393c
}