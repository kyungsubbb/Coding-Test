import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
         int result = 0;
         String[] val = sc.next().split("");
         
         for(String k : val){
             result += Integer.parseInt(k);
         }
         System.out.println(result);
    }
}