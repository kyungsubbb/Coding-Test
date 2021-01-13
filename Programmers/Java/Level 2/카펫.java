import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[] arr = new int[yaksu(yellow).size()];
        Iterator<Integer> iter = yaksu(yellow).iterator();
        for(int i=0; i<arr.length; i++){
            arr[i] = iter.next().intValue();
        }
        if(arr.length == 1 ){
            answer[0]= arr[0]+2;
            answer[1]= arr[0]+2;
        }
        else if(arr.length == 2 ){
            answer[0]= arr[0]+2;
            answer[1]= arr[1]+2;
        }
        else{
            int back = arr.length-1;
            for(int j=0; j<arr.length; j++){
                if(((arr[j]+2)*(arr[back]+2)-yellow) == brown){
                    answer[0] = arr[j]+2;
                    answer[1]= arr[back]+2;
                }
                else{
                    back -= 1;
                }
            }      
        }
        return answer;
    }
    
    ArrayList<Integer> yaksu(int yellow){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =yellow; i>=1; i--){
            if (yellow%i == 0){
                arr.add(i);
            }
        }
        return arr;
    }
}