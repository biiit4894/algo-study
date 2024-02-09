class Solution {
    public String solution(String my_string, int n) {
        char[] answer = new char[n];
        for(int i = 0; i < n; i++) {
            answer[i] = my_string.charAt(i);
        } 
        return String.valueOf(answer);
    }
}