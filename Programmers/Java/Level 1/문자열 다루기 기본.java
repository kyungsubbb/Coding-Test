import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int value;
        try{
            if(s.length()==4 || s.length()==6){
                for(int i = 0; i<s.length(); i++){
                    value = Integer.parseInt(s);
                }  
                answer = true;
            }
            else
                answer = false;

        }
        catch(Exception e){
            answer = false;
        }
        return answer;
    }
}