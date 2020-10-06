class Solution {
    public long solution(long n) {
        long answer;
        double k = Math.sqrt(n);
        if(k == (int)k){
            answer = (long)(Math.pow(k+1,2));
        }
        else
            answer = -1;
        
        return answer;
    }
}