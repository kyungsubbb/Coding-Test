import java.util.PriorityQueue;
// 프로그래머스 LEVEL2 : 더 맵게
public class PRO2_MoreSpicy {

	public static void main(String[] args) {
		int[] scoville= {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	static PriorityQueue<Integer> pq;
	private static int solution(int[] scoville, int k) {
		int answer = 0;
		pq = new PriorityQueue<>();
		for (int tmp : scoville) {
			pq.offer(tmp);
		}
		
		while(!upperK(k) && pq.size()>=2) {
			int v1 = pq.poll();
			int v2 = pq.poll();
			int res = v1 + (v2*2);
			pq.offer(res);
			answer ++;
		}
		if(!upperK(k) && pq.size() < 2) answer = -1;
		return answer;
	}

	private static boolean upperK(int K) {
		int tmp = pq.peek();
		if(tmp >= K) {
			return true;
		}
		return false;
	}

}
