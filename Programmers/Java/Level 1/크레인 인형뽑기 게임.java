import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> list = new Stack();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]!=0){
                    if(list.isEmpty())
                        list.push(board[j][moves[i]-1]);
                else{
                    if(list.peek()==board[j][moves[i]-1]){
                        answer +=2;
                        list.pop();
                    }
                    else{
                        list.push(board[j][moves[i]-1]);
                    }
            }
            board[j][moves[i]-1]=0;
            break;
         } 
    }
                
               
}
   
       return answer;
        }
}