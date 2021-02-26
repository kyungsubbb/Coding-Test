import java.util.*;
class Solution {
    static int sum = 0;
    static int count = 0;
    private static void cal(int cnt, int[] numbers, int target){
        if(cnt == numbers.length){
            sum = 0;
            for(int k : numbers){
                sum += k;
            }
            if(sum == target){
                count++;
                return;
            }
            else    return;
        }
        int[] arr = Arrays.copyOfRange(numbers, 0, numbers.length);
        
        cal(cnt+1, arr ,target);
        arr[cnt] *= -1;
        cal(cnt+1, arr, target);
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        cal(0, numbers, target);
        return count;
    }
}