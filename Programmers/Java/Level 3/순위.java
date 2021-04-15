import java.util.*;
class Solution {
    static final int INF = 99999;
    static boolean check[];
    public int solution(int n, int[][] results) {
        int answer = 0;
        int map[][] = new int[n+1][n+1];
        
        for(int[] tmp : map){
            Arrays.fill(tmp, INF);
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j) map[i][j] = 0;
            }
        }
        
        for(int[] tmp : results){
            map[tmp[0]][tmp[1]] = 1;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j) continue;
                for(int k=1; k<=n; k++){
                    if(i==k || j==k) continue;
                    if(map[j][k] > map[j][i] + map[i][k]) map[j][k] = map[j][i] + map[i][k];
                }
            }
        }
        
        check = new boolean[n+1];
        Arrays.fill(check, true);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j) continue;
                if(map[i][j] == INF && map[j][i] == INF) {
                    check[i] = false;
                    break;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(check[i]) answer++;
        }
        return answer;
    }
    
}