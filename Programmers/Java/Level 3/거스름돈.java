class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        int map[][] = new int[money.length + 1][n+1];
        for(int i=1; i<map.length; i++){
            int current = money[i-1];
            for(int j=1; j<= n ; j++){
                map[i][j] = map[i-1][j];
                if(j> current){
                    map[i][j] += map[i][j-current];
                }
                if(j == current){
                    map[i][j] += 1;
                }
            }
        }
        answer = map[money.length][n];
        return answer;
    }
}