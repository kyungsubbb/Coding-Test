package com.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2961 {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int result = Integer.MAX_VALUE;
	private static int N;
	private static Queue<int[]> q;
	private static ArrayList<int[]> list;

	private static void diff(int count) {
		for (int i = 0; i < count; i++) {
			q = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				if ((i & 1 << j) != 0) {
					q.offer(list.get(j));
				}
			}
			int x = 1;
			int y = 0;
			boolean flag = false;
			while (!q.isEmpty()) {
				int[] tmp = q.poll();
				flag = true;
				x *= tmp[0];
				y += tmp[1];
			}
			if (flag)
				result = Math.min(result, Math.abs(x - y));
		}

	}

	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(in.readLine());
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");

			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}
		int count = 1 << N;
		diff(count);
		System.out.println(result);
	}

}
