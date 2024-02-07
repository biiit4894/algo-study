class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int num_1 = num_list[num_list.length - 1];
        int num_2 = num_list[num_list.length - 2];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(num_1 > num_2) {
            answer[num_list.length] = num_1 - num_2;
        } else {
            answer[num_list.length] = num_1 * 2;
        }

        return answer;
    }
}