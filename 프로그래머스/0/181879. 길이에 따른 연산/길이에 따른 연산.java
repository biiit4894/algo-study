class Solution {
    public int solution(int[] num_list) {
        int sum1 = 0;
        int sum2 = 1;
        if(num_list.length >= 11) {
            for(int num : num_list) {
                sum1 += num;
            }
            return sum1;
        } else {
            for(int num : num_list) {
                sum2 *= num;
            }
            return sum2;
        }
    }
}