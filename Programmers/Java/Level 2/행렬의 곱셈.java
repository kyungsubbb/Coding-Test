class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr2[0].length;
        int[][] answer = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = sum(arr1, arr2, i,j);
            }
        }
        return answer;
    }
    private static int sum(int[][] arr1, int[][] arr2, int a, int b){
        int val = 0;
        int len = arr1[0].length;
        for(int i=0; i<len; i++){
            val += arr1[a][i] * arr2[i][b];
        }
        return val;
    }
}