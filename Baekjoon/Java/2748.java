import java.util.*;

public class Main{
    
     public static void main(String []args){
        
        int[] fibo = new int[20];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<fibo.length; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo[n]);
     }
}