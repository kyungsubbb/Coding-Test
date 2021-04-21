import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_17143 {
	static class shark {
		int r, c;
		int speed, dir, size;
		int num;

		public shark(int num, int r, int c, int speed, int dir, int size) {
			this.num = num;
			this.r = r;
			this.c = c;
			this.speed = speed;
			this.dir = dir;
			this.size = size;
		}

		@Override
		public String toString() {
			return "shark [r=" + r + ", c=" + c + ", speed=" + speed + ", dir=" + dir + ", size=" + size + ", num="
					+ num + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + num;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			shark other = (shark) obj;
			if (num != other.num)
				return false;
			return true;
		}

	}

	static shark[][] bowl;
	static int R, C, M;
	static int dx[] = { 0, -1, 1, 0, 0 }; // 위 아래 오른쪽 왼쪽
	static int dy[] = { 0, 0, 0, 1, -1 };
	static LinkedList<shark> shark = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(in.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());

			shark.offer(new shark(i, r, c, s, d, z));
		}

		makeArr();
		int res = 0;
		for (int i = 1; i <= C; i++) {
			res += getShark(i);
			moveShark();
			remove();
			makeArr();
		}
		System.out.println(res);

	}

	static Queue<shark> remove = new LinkedList<>();

	private static void makeArr() {
		bowl = new shark[R + 1][C + 1];
		Iterator<shark> it = shark.iterator();
		while (it.hasNext()) {
			shark tmp = (shark) it.next();
			if (bowl[tmp.r][tmp.c] != null) {
				if (bowl[tmp.r][tmp.c].size > tmp.size) {
					remove.offer(tmp);
					continue;
				} else {
					remove.offer(bowl[tmp.r][tmp.c]);
					bowl[tmp.r][tmp.c] = tmp;
				}
			} else {
				bowl[tmp.r][tmp.c] = tmp;
			}
		}
	}

	private static void remove() {
		while (!remove.isEmpty()) {
			shark tmp = remove.poll();
			shark.remove(tmp);
		}
	}

	private static void moveShark() {
		int size = shark.size();
		while (size-- > 0) {
			shark tmp = shark.poll();
			shark.offer(swim(tmp));
		}
	}

	private static shark swim(shark s) {
		int dir = s.dir;
		int r = s.r;
		int c = s.c;
		int speed = s.speed;
		while (speed-- > 0) {
			switch (dir) {
			case 1: // 상
				if (r - 1 >= 1) {
					r--;
				} else {
					r++;
					dir = 2;
				}
				break;
			case 2: // 하
				if (r + 1 <= R) {
					r++;
				} else {
					r--;
					dir = 1;
				}
				break;
			case 3: // 우
				if (c + 1 <= C) {
					c++;
				} else {
					c--;
					dir = 4;
				}
				break;
			case 4: // 좌
				if (c - 1 >= 1) {
					c--;
				} else {
					c++;
					dir = 3;
				}
				break;
			}
		}

		return new shark(s.num, r, c, s.speed, dir, s.size);
	}

	private static int getShark(int idx) {
		for (int i = 1; i <= R; i++) {
			if (bowl[i][idx] != null) {
				int tmp = bowl[i][idx].size;
				remove.offer(bowl[i][idx]);
				bowl[i][idx] = null;
				return tmp;
			}
		}
		return 0;
	}

}
