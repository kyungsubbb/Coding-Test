class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder("");
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++){
            String tmp[] = arr[i].split("");
            for(int j=0; j<tmp.length; j++){
                if(j==0) sb.append(tmp[j].toUpperCase());
                else sb.append(tmp[j].toLowerCase()); 
            }
            sb.append(" ");
        }
        if(s.charAt(s.length()-1) != ' ')
            sb.setLength(sb.length() - 1); 
        return sb.toString();
    }
}