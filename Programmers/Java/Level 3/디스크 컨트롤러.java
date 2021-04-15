import java.util.*;
class Solution {
    static class Hard implements Comparable<Hard>{
		int start, diff;

		public Hard(int start, int diff)  {
			this.start = start;
			this.diff = diff;
		}

		@Override
		public int compareTo(Hard o) {
			return this.diff - o.diff;
		}
		
	}
	static PriorityQueue<Hard> pq = new PriorityQueue<>();
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;   // 끝난 시간
        int disk = 0;   // 처리된 일
        int i = 0;
        Arrays.sort(jobs, (o1, o2) -> o1[0]-o2[0]);
        
        while(disk < jobs.length){
            while(i<jobs.length && time >= jobs[i][0]){
                pq.offer(new Hard(jobs[i][0], jobs[i][1]));
                i++;
            }
            
            if(pq.isEmpty()){
                time = jobs[i][0];
            }else{
                Hard hard = pq.poll();
                time += hard.diff;
        	    answer += time-hard.start;
                disk++;
            }
        }
        
        answer /= jobs.length;
        return answer;
    }
}