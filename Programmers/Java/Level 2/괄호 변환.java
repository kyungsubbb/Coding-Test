import java.util.*;
class Solution {
    public String solution(String p) {
        String answer = "";
        if(p.length() == 0) return answer;
        String u = "";
        String v = "";
        int idx = 1;
        int check = 0;
        
        u += p.charAt(0);
        if(p.charAt(0) == '(') check++;
        else if(p.charAt(0) == ')') check --;
        
        while(check != 0){
            u += p.charAt(idx);
            if(p.charAt(idx) == '(') check++;
            else if(p.charAt(idx) == ')') check --;
            idx++;
        }
        
        for(int i = idx; i < p.length(); i++){
            v += p.charAt(i);
        }
        
        if(checkRight(u)){
            return u + solution(v);
        }else{
            String t = "("+solution(v)+")";
            String tmp = "";
            for(int i=1; i<u.length()-1; i++){
                if(u.charAt(i) == '('){
                    tmp += ')';
                }else if(u.charAt(i) == ')'){
                    tmp += '(';
                }
            }
            return t+tmp;
        }
    }
    private static boolean checkRight(String a){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<a.length(); i++){
            if(!stack.isEmpty()){
                char k = stack.peek();
                if(k == '(' && a.charAt(i) == ')'){
                    stack.pop();
                    continue;
                }
            }
            stack.push(a.charAt(i));
        }
        if(stack.size()==0) return true;
        else return false;
    }
    
}