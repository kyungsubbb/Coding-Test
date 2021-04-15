import java.util.*;
class Solution {
    static ArrayList<Integer> map[];
    static boolean visit[];
    static int res;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n + 1];
        map = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            map[i] = new ArrayList<Integer>();
        }
        for(int[] tmp : edge){
            map[tmp[0]].add(tmp[1]);
            map[tmp[1]].add(tmp[0]);

        }
        BFS(1);
        answer = res;
        return answer;
    }
    static void BFS(int start){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start, 0});
        visit[start] = true;
        int dist = 0;
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            if(tmp[1] > dist){
                res = 1;
                dist = tmp[1];
            }else if(tmp[1] == dist){
                res++;
            }
            
            for(int i=0; i<map[tmp[0]].size(); i++){
                if(!visit[map[tmp[0]].get(i)]){
                    visit[map[tmp[0]].get(i)] = true;
                    q.offer(new int[]{map[tmp[0]].get(i), tmp[1]+1});
                }
            }
        }
    }
}