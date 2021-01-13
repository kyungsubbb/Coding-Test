class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int k=0; k<answer.length; k++){
            int count = 0;
            int value = prices[k];
            for(int i=k+1; i<prices.length; i++){
                if(prices[i]>=value){
                    count++;
                }
                else{
                    count++;
                    break;
                 }    
            }
            answer[k] = count;
        }
        return answer;
    }
}