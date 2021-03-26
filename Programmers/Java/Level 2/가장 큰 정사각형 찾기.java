import java.util.*;
class Solution
{
    public int solution(int [][]board)
    {
        int row = board.length;
        int col = board[0].length;
        int max = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 || j==0) continue;
                if(board[i][j] != 0)
                    board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1])+1;
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                max = Math.max(max, board[i][j]);
            }
        } 
        return max*max;
    }
    
}