import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_17471 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int man[], N;
	static ArrayList<Integer> selected = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> list;
	static int res;
	public static void main(String[] args) throws Exception{
		N = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine());
		
		man = new int[N + 1];
		res = Integer.MAX_VALUE;
		
		for (int i = 1; i <= N; i++) {
			man[i] = Integer.parseInt(st.nextToken());
		}
		
		list = new ArrayList<>();
		selected = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= N; i++) {		// 인접리스트 생성
			st = new StringTokenizer(in.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			for (int j = 0; j < cnt; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				list.get(i).add(tmp);
			}
		}
		for (int i = 1; i <= N/2; i++) {
			comb(0, 1, i);
		}
		
		if(res == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(res);
		
	}
	private static void comb(int idx, int start, int n) {
		if(idx == n) {
			gerry();
			return;
		}
		
		for (int i = start; i <= N; i++) {
			selected.add(i);
			comb(idx+1, i+1, n);
			selected.remove(selected.size()-1);
		}
		
	}
	private static void gerry() {
		ArrayList<Integer> notSelected = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if(selected.contains(i)) continue;
			notSelected.add(i);
		}
		if(!isConnect(selected)) return;
		if(!isConnect(notSelected)) return;
		
		int resA=0, resB=0;
		for (int i = 0; i < selected.size(); i++) {
			resA += man[selected.get(i)];
		}
		for (int i = 0; i < notSelected.size(); i++) {
			resB += man[notSelected.get(i)];
		}
		res = Math.min(res, Math.abs(resA-resB));
	}
	private static boolean isConnect(ArrayList<Integer> A) {
		boolean visit[] = new boolean[N+1];
		int num = A.get(0);
		visit[num] = true;
		int cnt = 1;
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(num);
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int k : list.get(tmp)) {
				if(!visit[k] && A.contains(k)) {
					q.offer(k);
					cnt ++;
					visit[k] = true;
				}
			}
		}
		
		if(cnt != A.size()) return false;
		return true;
	}

}
