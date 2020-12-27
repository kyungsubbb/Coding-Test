import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = new int[26];
        
        for(int a=0; a<arr.length; a++){
            arr[a] = -1;
        }
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            
            if(arr[ch - 'a'] == -1){
                arr[ch-'a'] = i;
            }
        }
        
        
        for(int k : arr){
            System.out.print(k+" ");
        }

    }
}