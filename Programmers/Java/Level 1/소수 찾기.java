class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean []so = new boolean[n+1];
        
        for(int i=2; i<=n; i++){
            so[i]=true;
        }
        int root = (int)Math.sqrt(n);
        for(int i=2; i<=root; i++){
            if(so[i]==true){
                for(int j=i; i*j<=n; j++)
                    so[i*j]=false;
            }
        }
        for(int i=2; i<=n; i++){
            if(so[i]==true)
                answer += 1;
        }
        return answer;
    }
}