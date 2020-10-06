import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int pp1=0;
        int pp2=0;
        int pp3=0;
        int tmp[] = {0,0,0};
        int tmp1[] = new int[3];
       
        for(int h=0; h<answers.length; h++){
            if(p1[h%5]==answers[h]){
                tmp[0]++;
                pp1++;
            }
            if(p2[h%8]==answers[h]){
                tmp[1]++;
                pp2++;
            }            
            if(p3[h%10]==answers[h]){
                tmp[2]++;
                pp3++;
            }  
        }
        Arrays.sort(tmp);
        int [] answer = {};
        if(tmp[2]==pp1 && tmp[2]==pp2 && tmp[2]==pp3){
            answer = new int[3];
            answer[0]=1;
            answer[1]=2;
            answer[2]=3;
            return answer;
        }
        else if(tmp[2]==pp1 && tmp[2]==pp2){
            answer = new int[2];
            answer[0]=1;
            answer[1]=2;
            return answer;
        }
        else if(tmp[2]==pp1 && tmp[2]==pp3){
            answer = new int[2];
            answer[0]=1;
            answer[1]=3;
            return answer;
        }
        else if(tmp[2]==pp2 && tmp[2]==pp3){
            answer = new int[2];
            answer[0]=2;
            answer[1]=3;
            return answer;
        }
        else if(tmp[2]==pp1){
            answer = new int[1];
            answer[0]=1;
            return answer;
        }
        else if(tmp[2]==pp2){
            answer = new int[1];
            answer[0]=2;
            return answer;
        }
        else if(tmp[2]==pp3){
            answer = new int[1];
            answer[0]=3;
            return answer;
        }
        return answer;
    }
}