class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;
        for(int n : num_list) {
            multiple *= n;
            sum += n;
        }
        return multiple < sum * sum ? 1 : 0;
    }
}