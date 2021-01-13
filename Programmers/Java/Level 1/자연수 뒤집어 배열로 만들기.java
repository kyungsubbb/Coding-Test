class Solution {
    public int[] solution(long n) {  
        int value = 1;
        long k = n;
        for(int i=0; i<12; i++){
            value++;
            k = k/10;
            if(k < 1)
                break;
        }
        int[] answer = new int[value-1];
        for(int i=0; i<answer.length; i++){
            answer[i]= (int)(n%10);
            n = n/10;
            if(n < 1)
                break;
        }
        return answer;
    }
}