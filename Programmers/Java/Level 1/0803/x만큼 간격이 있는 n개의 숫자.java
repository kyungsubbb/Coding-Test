class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = (long)x;
        if(n>1000){
            return null;
        }
        else{
                for(int i=0; i<n; i++){
                answer[i] = (long)value;
                value += (long)x;
            }
        }
        
        return answer;
    }
}