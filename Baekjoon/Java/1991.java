import java.util.*;
import java.io.*;

public class BOJ_1991 {
	static HashMap<String, String[]> map = new HashMap<>();
	static String a;

	static void rear(String f_idx) { // 후위순회 ( 왼쪽 -> 오른쪽 -> 루트 )
		if (map.get(f_idx)[0].equals(".") && map.get(f_idx)[1].equals(".")) {
			System.out.print(f_idx);
			return;
		} else if (map.get(f_idx)[0].equals(".")) {
			if (!map.get(f_idx)[1].equals(".")) {
				rear(map.get(f_idx)[1]);
				System.out.print(f_idx);
			}
		} else if (map.get(f_idx)[1].equals(".")) {
			if (!map.get(f_idx)[0].equals(".")) {
				rear(map.get(f_idx)[0]);
				System.out.print(f_idx);
			}
		} else {
			rear(map.get(f_idx)[0]);
			rear(map.get(f_idx)[1]);
			System.out.print(f_idx);
		}

	}

	static void front(String f_idx) { // 전위순회 ( 루트 -> 왼쪽 -> 오른쪽 )
		System.out.print(f_idx);
		if (map.get(f_idx)[0].equals(".") && map.get(f_idx)[1].equals(".")) {
			return;
		} else if (map.get(f_idx)[0].equals(".")) {
			if (!map.get(f_idx)[1].equals(".")) {

				front(map.get(f_idx)[1]);
			}
		} else if (map.get(f_idx)[1].equals(".")) {
			if (!map.get(f_idx)[0].equals(".")) {

				front(map.get(f_idx)[0]);
			}
		} else {
			front(map.get(f_idx)[0]);
			front(map.get(f_idx)[1]);
		}

	}

	static void mid(String f_idx) { // 중위순회 ( 왼쪽 -> 루트 -> 오른쪽 )
		if (map.get(f_idx)[0].equals(".") && map.get(f_idx)[1].equals(".")) {
			System.out.print(f_idx);
			return;
		} else if (map.get(f_idx)[0].equals(".")) {
			if (!map.get(f_idx)[1].equals(".")) {
				System.out.print(f_idx);
				mid(map.get(f_idx)[1]);

			}
		} else if (map.get(f_idx)[1].equals(".")) {
			if (!map.get(f_idx)[0].equals(".")) {
				mid(map.get(f_idx)[0]);
				System.out.print(f_idx);
			}
		} else {
			mid(map.get(f_idx)[0]);
			System.out.print(f_idx);
			mid(map.get(f_idx)[1]);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int n = Integer.parseInt(sc.readLine()); //
		for (int i = 0; i < n; i++) {
			String tmp = sc.readLine();
			if (i == 0)
				a = tmp.substring(0, 1);
			map.put(tmp.substring(0, 1), tmp.substring(2).split(" "));
		}

		front(a);
		System.out.println();
		mid(a);
		System.out.println();
		rear(a);

	}

}
