class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
               if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                   if(c+n>'Z'){
                       answer += (char)(c+n-26);
                   }
                   else
                       answer += (char)(c+n);
               }
                else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    if(c+n>'z'){
                       answer += (char)(c+n-26);
                   }
                   else
                       answer += (char)(c+n);
                }
                else
                    answer += (char)c;
            }
                    
        return answer;
    }
}

// 참고