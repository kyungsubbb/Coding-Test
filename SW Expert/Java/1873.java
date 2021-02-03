import java.util.Scanner;

class SWEX_1873 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char arr[][] = new char[H][W];

			for (int i = 0; i < H; i++) {
				arr[i] = sc.next().toCharArray();
			}
			int skill_num = sc.nextInt();
			char skill[] = sc.next().toCharArray();

			int tank_x = 0;
			int tank_y = 0;
			char current_tank = '^';
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (arr[i][j] == '^' || arr[i][j] == '>' || arr[i][j] == '<' || arr[i][j] == 'v') {
						tank_x = i;
						tank_y = j;
						current_tank = arr[i][j];
					}
				}
			}

			for (int i = 0; i < skill.length; i++) {

				// System.out.println(tank_x + " "+ tank_y);
				if (skill[i] == 'S') {
					int nx = tank_x;
					int ny = tank_y;
					if (current_tank == '^') {
						nx--;
						while (nx >= 0) {
							if (arr[nx][ny] == '#')
								break;
							else if (arr[nx][ny] == '*') {
								arr[nx][ny] = '.';
								break;
							} else
								nx--;
						}
					} else if (current_tank == '>') {
						ny++;
						while (ny < W) {
							if (arr[nx][ny] == '#')
								break;
							else if (arr[nx][ny] == '*') {
								arr[nx][ny] = '.';
								break;
							} else
								ny++;
						}
					} else if (current_tank == '<') {
						ny--;
						while (ny >= 0) {
							if (arr[nx][ny] == '#')
								break;
							else if (arr[nx][ny] == '*') {
								arr[nx][ny] = '.';
								break;
							} else
								ny--;
						}
					} else if (current_tank == 'v') {
						nx++;
						while (nx < H) {
							if (arr[nx][ny] == '#')
								break;
							else if (arr[nx][ny] == '*') {
								arr[nx][ny] = '.';
								break;
							} else
								nx++;
						}
					}

				} else if (skill[i] == 'U') {
					current_tank = '^';
					if (tank_x - 1 >= 0 && arr[tank_x - 1][tank_y] == '.') {
						arr[tank_x - 1][tank_y] = '^';
						arr[tank_x][tank_y] = '.';
						tank_x -= 1;
					} else {
						arr[tank_x][tank_y] = '^';
					}
				} else if (skill[i] == 'D') {
					current_tank = 'v';
					if (tank_x + 1 < H && arr[tank_x + 1][tank_y] == '.') {
						arr[tank_x + 1][tank_y] = 'v';
						arr[tank_x][tank_y] = '.';
						tank_x += 1;
					} else {
						arr[tank_x][tank_y] = 'v';
					}

				} else if (skill[i] == 'L') {
					current_tank = '<';
					if (tank_y - 1 >= 0 && arr[tank_x][tank_y - 1] == '.') {
						arr[tank_x][tank_y - 1] = '<';
						arr[tank_x][tank_y] = '.';
						tank_y -= 1;
					} else {
						arr[tank_x][tank_y] = '<';
					}

				} else if (skill[i] == 'R') {
					current_tank = '>';
					if (tank_y + 1 < W && arr[tank_x][tank_y + 1] == '.') {
						arr[tank_x][tank_y + 1] = '>';
						arr[tank_x][tank_y] = '.';
						tank_y += 1;
					} else {
						arr[tank_x][tank_y] = '>';
					}

				}

			}

			System.out.print("#" + test_case + " ");
			for (int k = 0; k < H; k++) {
				for (int j = 0; j < W; j++) {
					System.out.print(arr[k][j]);
				}
				System.out.println();
			}
			// System.out.println();
		}
		sc.close();
	}
}