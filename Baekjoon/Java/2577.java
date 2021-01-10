import java.util.*;

public class Main{
    
     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a*b*c;
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        while(result / 10 > 0){
            arr[result % 10] += 1;
            result /= 10;
        }
        arr[result] += 1;
        for(int z : arr){
            System.out.println(z);
        }
        
     }
}