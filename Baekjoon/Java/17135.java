package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JUN17135_CastleDefense {
	static int N, M, D, max;
	static int selected[];//궁수들 위치.조합 결과 0, 1, 2
	static ArrayList<Enemy> elist;
	
	static class Enemy{
		int r, c;
		public Enemy(int r, int c) {			
			this.r = r;//한행 하강할 때 조정 +1
			this.c = c;//더 왼쪽에 있는 적 결정할 때 사용
		}
		@Override
		public String toString() {
			return "Enemy [r=" + r + ", c=" + c + "]";
		}		
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.초기값 입력
		N = sc.nextInt();//행
		M = sc.nextInt();//열
		D = sc.nextInt();//유효거리
		selected = new int[3];
		//2.적 정보 입력 
		elist = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(sc.nextInt() == 1) {
					elist.add(new Enemy(i,j));
				}
			}
		}		
		
		//3.궁수의 조합을 만들어 각 조합마다 몇명을 죽일 수 있는지 계산 =>max
		combination(0,0);
		
		//4.max 출력
		System.out.println(max);
		
	}
	//궁수 조합 만들기. 적을 죽여보고 max 갱신
	private static void combination(int cnt, int start) {
		if(cnt == 3) {//조합 한개 완성. 궁수 3명 준비-> 쏴보기
			ArrayList<Enemy> elist2 = new ArrayList<>();//copy
			for(Enemy x: elist) {
				elist2.add(new Enemy(x.r, x.c));
			}//복사본. 각 조합마다 쏴봐야 하므로 원본에는 손대면 안됨
			
			int killed = gameStart(elist2, selected);//하나의 궁수 조합 당 사살된 적의 수
			max = Math.max(max, killed);
			return;
		}
		
		for (int i = start; i < M; i++) {
			selected[cnt] = i;//0~
			combination(cnt + 1, i + 1);
		}
	}
	
	//하나의 궁수 조합으로 죽일 수 있는 적의 수 계산해서 리턴
	private static int gameStart(ArrayList<Enemy> elist2, int[] selected) {
		int cnt = 0;//적의 수
		
		while(elist2.size() != 0) {//적이 있는 동안
			
			ArrayList<Enemy> tmp = new ArrayList<>();
			
			//궁수3명이 쏠거임.자신에게서 제일 가까운 적을 찾아서 모아놈.
			for (int pos: selected) {
				int targetIndex = findNear(elist2, pos);//자신에게서 제일 가까운 적을 찾아
				
				if(targetIndex >= 0) {//적이 있으면
					tmp.add(elist2.get(targetIndex));					
				}
			}//요기까지 오면 궁수 3명이 tmp에 죽일 놈 정보를 저장한 후!!!
			
			//요기서 죽임
			for(Enemy x : tmp) {
				if(elist2.remove(x)) {//삭제한 경우
					cnt++;//죽일놈 증가
				}
			}
		
			enemyDown(elist2);//적 하강
			
		}	
		
		return cnt;
	}
	
	
	
	private static void enemyDown(ArrayList<Enemy> elist2) {
		//list에서 하나씩 꺼내서 r값 +1
		//N을 넘지 않는지 체크 -> 넘으면 삭제
		int size = elist2.size();
		
		while(size>0) {
			if(elist2.get(0).r+1 < N) {
				elist2.add(new Enemy(elist2.get(0).r+1, elist2.get(0).c));
			}
			elist2.remove(0);
			size--;
		}
	}
	
	private static int findNear(ArrayList<Enemy> elist2, int pos) {		
		int targetidx = -1;
		int[] dist = new int[elist2.size()];
		for (int i = 0; i < elist2.size(); i++) {
			dist[i] = Math.abs(elist2.get(i).r - N)+ Math.abs(elist2.get(i).c - pos);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < dist.length; i++) {
			if(dist[i]>D) continue;
			if(min>dist[i]) {
				min = dist[i];
				targetidx = i;
			}
			else if(min == dist[i] && targetidx >= 0 && elist2.get(i).c < elist2.get(targetidx).c) {
				min = dist[i];
				targetidx = i;
			}
		}
		

		return targetidx;
	}	
	

}




