import java.util.*;
class Solution {
    static ArrayList<int[]> map = new ArrayList<>();
    public int solution(int n, int[][] computers) {
        int answer = 0;
        for(int i=0; i<computers.length; i++){
            for(int j=i+1; j<computers[i].length; j++){
                if(computers[i][j] ==  1){
                    map.add(new int[]{i,j});
                    map.add(new int[]{j,i});
                }
                
            }
        }
        int cnt = 0;
        boolean[] flag = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<n; i++){
            if(!flag[i]){
                q.offer(i);
                cnt++;
                while(!q.isEmpty()){
                    int tmp = q.poll();
                    if(!flag[tmp]){
                        flag[tmp] = true;
                        for(int j=0; j<map.size(); j++){
                        if(map.get(j)[0] == tmp){
                            q.offer(map.get(j)[1]);
                            }
                        }
                    }
                }
            
            }
            
        }

        return cnt;
    }
}