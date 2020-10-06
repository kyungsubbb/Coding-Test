import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int max =0;
        Queue<Integer> q = new LinkedList<>();
        for(int t : truck_weights){
            
            while(true){
                if(q.isEmpty()){
                q.offer(t);
                max += t;
                answer ++ ;
                break;
            }
            else if(q.size() == bridge_length){
                max -= q.poll();
            }
            else{
                if(max + t > weight){
                    q.offer(0);
                    answer ++;
                }
                else{
                    q.offer(t);
                    max += t;
                    answer ++;
                    break;
                }
            }    
        }       
    }
        return answer + bridge_length;
    }
}

//googling의 힘