class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] rny_arr = rny_string.split("");
        
        for(int i = 0; i < rny_arr.length; i++) {
            if(rny_arr[i].equals("m")) {
                rny_arr[i] = "rn"; 
            }
        }
        for(String str : rny_arr) {
            answer += str;
        }
    
        return answer;
    }
}