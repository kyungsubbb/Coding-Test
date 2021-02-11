import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class SWEA_1233 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(in.readLine());
            boolean flag = false;
            for (int i = 1; i <= N; i++) {
                String tmp[] = in.readLine().split(" ");
                if (tmp.length == 4) {        																				// 자식이 양쪽다 있으면 숫자가 오면 안됨
                    if (!tmp[1].equals("/") && !tmp[1].equals("*") && !tmp[1].equals("+") && !tmp[1].equals("-")) {			// 숫자인 경우 flag를 참으로 변경
                        flag = true;
                    }
                } else if (tmp.length == 3) {        																		// 자식이 하나면 연산이 불가
                        flag = true;
                } else if (tmp.length == 2) {																				// 자식이 없을 경우
                    if (tmp[1].equals("/") || tmp[1].equals("*") || tmp[1].equals("+") || tmp[1].equals("-")) {				// 문자인 경우 flag를 참으로 변경
                        flag = true;
                    }
                }
            }
            
            if (flag) {																										// flag를 거짓으로 바꾸는 코드가 없기 때문에 참이 하나라도 있으면 연산 불가
                System.out.println("#" + tc + " " + 0);
            } else {
                System.out.println("#" + tc + " " + 1);
            }
 
        }
    }
 
}