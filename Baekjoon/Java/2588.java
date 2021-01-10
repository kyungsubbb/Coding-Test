import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result3 = a * (b%10);
    int result4 = a * ((b/10)%10);
    int result5 = a * (b/100);
    int result = result3 + 10*result4 + 100*result5;
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result);


    }
}

/*
210110 수정본
import java.util.*;

public class Main{
    
     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a*b;
        while(b >= 1){
            System.out.println(a * (b % 10));
            b /= 10;
        }
       System.out.println(result);
        
     }
}
*/