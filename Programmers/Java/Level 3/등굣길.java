import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int map[][] = new int[n+1][m+1];
        boolean nospot[][] = new boolean[n+1][m+1];
        
        for(int[] tmp : puddles){
            if(tmp.length > 0)
                nospot[tmp[1]][tmp[0]] = true;
        }
        
        map[1][1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 && j==1) continue;
                if(nospot[i][j]) continue;
                
                map[i][j] = (map[i-1][j] + map[i][j-1])%1000000007;
                
                
            }
        }
        answer = map[n][m];
        return answer;
    }
}