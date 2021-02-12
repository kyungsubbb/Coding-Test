import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);                                    // 앞과 뒤의 합을 이용해서 구하기위함
        int count = people.length;                              // 남은 사람의 수
        int num = 0;
        for(int cnt = people.length-1; cnt>=0; cnt --){
            if(people[cnt] <= limit/2) break;                   // 제한이 절반 이하일 경우 -> 이보다 앞에 있는 요소들은 두명씩 탑승 가능
            else if(people[cnt] == cnt) {                       // 제한과 같을 경우에는 이사람만 태우고 간다.
                answer++;
                count --;
            }
            else if(people[num]+people[cnt]<= limit){           // 앞 사람 + 뒷 사람의 합이 제한보다 적을 경우에는 두명을 태우면 됨
                answer ++;                                      // 보트 수 1 증가
                count -= 2;                                     // 사람 수 2 감소
                num ++;                                         // 앞 사람 번호 1 증가 -> 다음으로 무거운 사람 탑승
            }
            else{                                               // 앞사람과 뒷사람이 같이 못타는 경우 -> 뒷사람만 태워서 감
                count --;
                answer ++;
            }
        }
        answer += (count%2==0) ? count/2 : count/2+1;           // 절반 이하로 남은 사람 수(count)를 확인, 2로 나눠 떨어지면 그만큼 수의 배만 추가
        return answer;                                          // 아니라면 2로 나눈 수에 1개의 배가 더 필요함.
    }
}