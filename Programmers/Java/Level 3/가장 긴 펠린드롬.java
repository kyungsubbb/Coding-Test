class Solution
{
    static int count=1;
    public int solution(String s)
    {
        int answer = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            checkP(s, i, 1);
            if(i<len-1 && s.charAt(i)==s.charAt(i+1)){
                checkPeven(s,i,1);
            }
        }
        answer = count;
        return answer;
    }
    private static void checkP(String s, int idx, int len){
        if(idx-len < 0 || idx+len >= s.length()) {
            count = Math.max(count, len*2 -1);
            return;
        }
        if(s.charAt(idx-len) == s.charAt(idx+len)){
            checkP(s, idx, len+1);
        }else{
            count = Math.max(count, len*2 -1);
        }
    }
    private static void checkPeven(String s, int idx, int len){
        
        if(idx-len < 0 || idx+1+len >= s.length()) {
            count = Math.max(count, (len+1)*2-2);
            return;
        }
       
        if(s.charAt(idx-len) == s.charAt(idx+1+len)){
            checkPeven(s, idx, len+1);
        }else{
            count = Math.max(count, (len+1)*2-2);
        }
            
        
    }
}