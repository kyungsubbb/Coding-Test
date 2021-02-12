import java.util.HashMap;
import java.util.Stack;

class Solution {
    
    public int[] solution(int m, int n, int[][] picture) {
        int dx[] = {-1, 0, 1, 0}; // 하, 우, 상, 좌
        int dy[] = {0, 1, 0, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean[][] bool;
        
        bool = new boolean[m][n];
    	int section = 0;
        
    	for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[i].length; j++) {
				if(picture[i][j] == 0) {
					bool[i][j] = true;
					continue;
				}
				if(!bool[i][j]) {
					section++;
					Stack<int[]> stack = new Stack<>();
					stack.push(new int[] {i, j});
					bool[i][j] = true;
					int num = 0;
					while(!stack.isEmpty()) {
						int[] tmp = stack.pop();
						num++;
						for (int k = 0; k < dx.length; k++) {
							int nx = tmp[0];
							int ny = tmp[1];
							if(nx+dx[k]>=0 && nx+dx[k]<m && ny+dy[k]>=0 && ny+dy[k]<n && picture[nx+dx[k]][ny+dy[k]] == picture[i][j] && !bool[nx+dx[k]][ny+dy[k]]) {
								nx += dx[k];
								ny += dy[k];
								stack.push(new int[] {nx, ny});
								bool[nx][ny] = true;
							}
						}
						
					}
					if(!map.containsKey(picture[i][j])){
						map.put(picture[i][j],num);
					}
					else {
						map.put(picture[i][j],Math.max(map.get(picture[i][j]), num));
					}
				}
				
			}
		}
    	int max = Integer.MIN_VALUE;
        for(int tmp : map.keySet()) {
        	if(map.get(tmp) > max) max = map.get(tmp);
        }
        if(max<=0) max = 0;
        int[] answer = {section, max};
       
        return answer;
    }
}