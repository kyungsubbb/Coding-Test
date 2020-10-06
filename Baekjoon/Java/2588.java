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