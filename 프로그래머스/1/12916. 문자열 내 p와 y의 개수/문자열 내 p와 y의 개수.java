class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.split("");
        int p_count = 0;
        int y_count = 0;
        
        for(String str : arr) {
            if(str.equals("p") || str.equals("P")) {
                p_count++;
            } else if(str.equals("y") || str.equals("Y")) {
                y_count++;
            }
        }
        
        if(p_count == y_count) {
            answer = true;
        } else {
            answer = false;
        }
        

        return answer;
    }
}