import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1931 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static class Room implements Comparable<Room> {
		int start, finish;

		public Room(int start, int finish) {
			this.start = start;
			this.finish = finish;
		}

		@Override
		public String toString() {
			return "Room [start=" + start + ", finish=" + finish + "]";
		}

		@Override
		public int compareTo(Room o) {
			if (this.finish == o.finish)
				return this.start - o.start;
			return this.finish - o.finish;
		}

	}

	static PriorityQueue<Room> pq;
	static int count;

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(in.readLine());
		pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int finish = Integer.parseInt(st.nextToken());
			pq.offer(new Room(start, finish));
		}
		Room tmp = pq.poll();
		int finishTime = tmp.finish;
		count++;
		while (!pq.isEmpty()) {
			Room r = pq.poll();
			if (finishTime <= r.start) {
				finishTime = r.finish;
				count++;
			}
		}
		System.out.println(count);
	}

}
