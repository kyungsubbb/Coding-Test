class Solution {
    public int[] solution(int n) {
        int[][] tri = new int[n][];
        for(int i=1; i<=n ; i++){
            tri[i-1] = new int[i];
        }
        int i = 0;
        int j = 0;
        int cnt = 1;
        int max = n*(n+1)/2;
        int[] answer = new int[max];
        tri[i][j] = cnt;
        while(cnt < max){
            while(i+1 < n && tri[i+1][j] == 0){
                tri[++i][j] = ++cnt;
            }
            while(j+1 < n && tri[i][j+1] == 0){
                tri[i][++j] = ++cnt;
            }
            while(i-1 > 0 && j-1 > 0 && tri[i-1][j-1] == 0){
                tri[--i][--j] = ++cnt;
            }
        }
        
        int c = 0;
        for(int a[] : tri) {
        	for(int k : a) {
        		answer[c++] = k;
        	}
        }
        return answer;
    }
}