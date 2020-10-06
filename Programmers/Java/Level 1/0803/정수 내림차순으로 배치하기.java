import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = ""+n;
        String c = "";
        int []b = new int[a.length()];
        int []tmp = new int[a.length()];
        for(int i=0; i<b.length; i++){
            b[i] = (int)(n%10);
            n = n/10;
            if(n<1){
                break;
            }
        }
        Arrays.sort(b);
        for(int i=b.length-1; i>-1; i--){
            c += b[i];
        }
        answer = Long.parseLong(c);
        return answer;
    }
}