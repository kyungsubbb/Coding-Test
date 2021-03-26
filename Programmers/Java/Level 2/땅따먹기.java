class Solution {
	int solution(int[][] land) {
		int answer = Integer.MIN_VALUE;
		int[] tmp = new int[3];
		for (int i = land.length - 2; i >= 0; i--) {
			for (int j = 0; j < land[i].length; j++) {
				switch (j) {
				case 0:
					tmp[0] = land[i + 1][1];
					tmp[1] = land[i + 1][2];
					tmp[2] = land[i + 1][3];
					break;
				case 1:
					tmp[0] = land[i + 1][0];
					tmp[1] = land[i + 1][2];
					tmp[2] = land[i + 1][3];
					break;
				case 2:
					tmp[0] = land[i + 1][0];
					tmp[1] = land[i + 1][1];
					tmp[2] = land[i + 1][3];
					break;
				case 3:
					tmp[0] = land[i + 1][0];
					tmp[1] = land[i + 1][1];
					tmp[2] = land[i + 1][2];
					break;
				}
				int max = Integer.MIN_VALUE;
				for (int k = 0; k < tmp.length; k++) {
					if (max < tmp[k])
						max = tmp[k];
				}
				land[i][j] += max;
			}
		}

		for (int i = 0; i < land[0].length; i++) {
			if (land[0][i] > answer)
				answer = land[0][i];
		}

		return answer;
	}
}