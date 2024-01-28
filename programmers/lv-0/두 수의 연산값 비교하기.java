class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aToString = Integer.toString(a);
        String bToString = Integer.toString(b);
        int ab = Integer.parseInt(aToString + bToString);
        
        if(Integer.parseInt(aToString + bToString) >= 2 * a * b) {
            answer = ab;
        } else {
            answer = 2 * a * b;
        }
        
        return answer;
    }
}