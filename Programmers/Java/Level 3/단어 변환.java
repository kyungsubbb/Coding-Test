import java.util.*;
class Solution {
    static int count = Integer.MAX_VALUE;
    static boolean visited[];
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean flag = false;
        visited = new boolean[words.length];
        for(String word : words){
            if(word.equals(target)) {
                flag = true;
                break;
            }
        }
        if(flag){
            DFS(begin, target, words, 0);
            answer = count;
        }

        return answer;
    }
    private static void DFS(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            count = Math.min(count, cnt);
            return;
        }
        for(int i = 0; i<words.length; i++){
            if(words[i].equals(begin)) continue;
            int check = checkDiff(begin, words[i]);
            if(check != 1) continue;
            if(visited[i]) continue;
            visited[i] = true;
            DFS(words[i], target, words, cnt+1);
            visited[i] = false;
        }
    }
    
    private static int checkDiff(String begin, String tmp) {
        int num = 0;
        for(int i = 0; i<begin.length(); i++){
            if(begin.charAt(i) != tmp.charAt(i)) num++;
        }
        return num;
    }
}