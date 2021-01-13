class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] tmp = phone_number.split("");
        for(int i=0; i<tmp.length-4;i++){
            tmp[i] = "*";
        }
        for(int i=0; i<tmp.length;i++){
            answer += tmp[i];
        }
        return answer;
    }
}