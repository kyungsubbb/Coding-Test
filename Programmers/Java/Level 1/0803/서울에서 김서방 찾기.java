class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int value = 0;
        for(int i=0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                value = i;
            }
        }
        answer = "김서방은 "+value+"에 있다";
        return answer;
    }
}