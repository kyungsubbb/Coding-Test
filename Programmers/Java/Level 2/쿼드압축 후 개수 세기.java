import java.util.*;
class Solution {
    static int count;
    static int[] val = new int[2];
    public int[] solution(int[][] arr) {
        
        int size = arr.length;
        if(isAvail(arr, 0, 0, size)){
            int tmp = arr[0][0];
            val[tmp]++;
            return val;
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                DFS(arr, size/2, i*(size/2), j*(size/2));   // 배열, 사이즈, 시작점
            }
        }
        int[] answer = val;
        return answer;
    }
   
    private static boolean isAvail(int[][] arr, int a, int b, int len){
        int tmp = arr[a][b];
        for(int i=a; i <a+len; i++){
            for(int j=b; j<b+len; j++){
                if(arr[i][j] != tmp) return false;
            }
        }
        return true;
    }
    private static void DFS(int[][] arr, int size, int x, int y){
        int tmp = arr[x][y];
        if(size == 1){
            val[tmp]++;
            return;
        }
        
        if(isAvail(arr, x, y, size)){
            val[tmp]++;
            return;
        }
        int len = size/2;
        DFS(arr, len, x, y);
        DFS(arr, len, x+len, y);
        DFS(arr, len, x, y+len);
        DFS(arr, len, x+len, y+len);
        
    }
}