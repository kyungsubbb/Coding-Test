class Solution {
    public String solution(String s) {
        String answer = "";
        String []tmp = s.split("");
        String space = " ";
        int value=0;
        for(int i=0; i<tmp.length; i++){
            if(tmp[i].equals(space)){
                value = 0;
            }
            else{
                if(value%2 == 0)
                    tmp[i] = tmp[i].toUpperCase();
                
                else
                    tmp[i] = tmp[i].toLowerCase();
                value++;
            }
            answer += tmp[i];
        }
        return answer;
    }
}

// 참고