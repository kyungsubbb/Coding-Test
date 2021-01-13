<<<<<<< HEAD
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String tmp = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(int i=0; i<tmp.length(); i++){
           char k=tmp.charAt(i);
            if(k == 'p'){
                p++;
            }
            else if(k == 'y'){
                y++;
            }
        }
        if(p == y){
            answer = true;
        }
        else 
            answer = false ;

        return answer;
    }
=======
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String tmp = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(int i=0; i<tmp.length(); i++){
           char k=tmp.charAt(i);
            if(k == 'p'){
                p++;
            }
            else if(k == 'y'){
                y++;
            }
        }
        if(p == y){
            answer = true;
        }
        else 
            answer = false ;

        return answer;
    }
>>>>>>> 1b293a049fc6f80cba1d2a1a4bf2df0679da393c
}