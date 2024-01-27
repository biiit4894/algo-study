class Solution {
    public int solution(int a, int b) {
        String add1 = Integer.toString(a) + Integer.toString(b);
        String add2 = Integer.toString(b) + Integer.toString(a);
        int answer = (Integer.parseInt(add1) > Integer.parseInt(add2)) ? Integer.parseInt(add1) : Integer.parseInt(add2);
        return answer;
    }
}