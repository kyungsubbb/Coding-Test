import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%4 == 0){
        if(year%100 == 0 && year%400 != 0){
            System.out.print("0");
        }else{
            System.out.print("1");
        }
    }else{
      System.out.print("0");
    }
    


    }
}