import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int value = 0;
        for(int j=0; j<b; j++){
            for(int i=0; i<a; i++){
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}