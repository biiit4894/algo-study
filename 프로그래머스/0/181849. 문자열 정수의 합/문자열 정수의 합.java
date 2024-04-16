class Solution {
    public int solution(String num_str) {
        int[] num_arr = new int[num_str.length()];
        for(int i = 0; i < num_str.length(); i++) {
            num_arr[i] = num_str.charAt(i) - '0';
        }
        int answer = 0;
        for(int i = 0; i < num_arr.length; i++) {
            answer += num_arr[i];
        }
        return answer;
    }
}