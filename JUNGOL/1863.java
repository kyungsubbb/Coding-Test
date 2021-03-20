import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder("");
    static int parents[], n, m;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(in.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
         
        parents = new int[n+1];
        make();
         
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int pre = Integer.parseInt(st.nextToken());
            int post = Integer.parseInt(st.nextToken());
            unionSet(pre, post);
        }
        check();
    }
    private static void check() {
        int cnt = 0;
        for (int i = 1; i < parents.length; i++) {
            if(parents[i] == i) cnt++;
        }
        System.out.println(cnt);
    }
     
    private static void unionSet(int pre, int post) {
        if(findSet(pre) == findSet(post)) return;
        parents[findSet(post)] = findSet(pre);
    }
    private static int findSet(int a) {
        if(parents[a] == a) return a;
        return parents[a] = findSet(parents[a]);
    }
    private static void make() {
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
    }
}