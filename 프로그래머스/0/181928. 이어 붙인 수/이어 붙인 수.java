class Solution {
    public int solution(int[] num_list) {

        String oddNumber = "";
        String evenNumber = "";
        
        for(int num : num_list) {
            if(num % 2 != 0) {
                oddNumber += num;
            } else {
                evenNumber += num;
            }
        }
        return Integer.parseInt(oddNumber) + Integer.parseInt(evenNumber);
    }
}