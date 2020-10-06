class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String tmp="";
        String k = "";
        for(int i=0; i<n; i++){
            tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(tmp.length()<n){
                tmp = String.format("%"+n+"s", tmp);
            }
            tmp = tmp.replace("1","#").replace("0"," ");
            answer[i] = tmp;
  
        }
        return answer;
    }
}

//참고
//Stirng.format "%"+n+"s" -> n자리를 맞추고, 앞을 공백으로 채움.