

class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n) + 1);
        int[] answer = new int[length];
        
        int index = 0;
        while(n != 0) {
            answer[index++] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}