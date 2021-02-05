import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(')
                stack.push(arr[i]);
            else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
        
    }
}