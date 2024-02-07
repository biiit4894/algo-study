class Solution {
    public int[] solution(int start_num, int end_num) {
        int arr_len = end_num - start_num + 1;
        int[] answer = new int[arr_len];
        for(int i = 0; i < arr_len; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}